import java.util.*;

public class Solution {

    static class Node {
        int index;
        Node prev, next;
        Node(int index) {
            this.index = index;
            this.prev = null;
            this.next = null;
        }
    }

    public static String solution(int n, int k, String[] cmd) {
        // Initialize the doubly linked list
        Node head = new Node(0);
        Node curr = head;
        Node[] nodes = new Node[n];
        nodes[0] = head;

        for (int i = 1; i < n; i++) {
            Node newNode = new Node(i);
            nodes[i] = newNode;
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }

        // Initially selected node
        Node selectedNode = nodes[k];

        // Track deleted rows
        Set<Integer> deletedRows = new HashSet<>();
        // Stack to manage restoration
        Stack<Node> deletionStack = new Stack<>();

        for (String command : cmd) {
            if (command.startsWith("U")) {
                // Move up
                int X = Integer.parseInt(command.substring(2));
                for (int i = 0; i < X; i++) {
                    if (selectedNode.prev != null) {
                        selectedNode = selectedNode.prev;
                    }
                }
            } else if (command.startsWith("D")) {
                // Move down
                int X = Integer.parseInt(command.substring(2));
                for (int i = 0; i < X; i++) {
                    if (selectedNode.next != null) {
                        selectedNode = selectedNode.next;
                    }
                }
            } else if (command.equals("C")) {
                // Delete the current node
                deletionStack.push(selectedNode);
                deletedRows.add(selectedNode.index);
                if (selectedNode.prev != null) {
                    selectedNode.prev.next = selectedNode.next;
                }
                if (selectedNode.next != null) {
                    selectedNode.next.prev = selectedNode.prev;
                }
                selectedNode = (selectedNode.next != null) ? selectedNode.next : selectedNode.prev;
            } else if (command.equals("Z")) {
                // Restore the most recently deleted node
                Node lastDeletedNode = deletionStack.pop();
                deletedRows.remove(lastDeletedNode.index);
                if (lastDeletedNode.prev != null) {
                    lastDeletedNode.prev.next = lastDeletedNode;
                }
                if (lastDeletedNode.next != null) {
                    lastDeletedNode.next.prev = lastDeletedNode;
                }
                // Insert it back in the list
                // If the restored node should be head (first node), adjust head reference.
                if (lastDeletedNode.prev == null) {
                    head = lastDeletedNode;
                }
            }
        }

        // Construct the final result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(deletedRows.contains(i) ? 'X' : 'O');
        }

        return result.toString();
    }


}
