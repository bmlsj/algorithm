import java.util.*;
class Solution {
    static class TreeNode {
        int x, y, index;
        TreeNode left, right;

        TreeNode(int x, int y, int index) {
            this.x = x;
            this.y = y;
            this.index = index;
        }
    }

    public int[][] solution(int[][] nodeinfo) {
        int n = nodeinfo.length;
        TreeNode[] nodes = new TreeNode[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new TreeNode(nodeinfo[i][0], nodeinfo[i][1], i + 1);
        }

        // 정렬
        Arrays.sort(nodes, (a, b) -> {
            if (b.y == a.y) return a.x - b.x;
            return b.y - a.y;
        });

        // 이진 트리 생성
        TreeNode root = nodes[0];
        for (int i = 1; i < n; i++) {
            insertNode(root, nodes[i]);
        }

        // 전위, 후위 배열
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();

        preOrder(root, preOrder);
        postOrder(root, postOrder);

        // 2차원 배열에 넣기
        int[][] answer = new int[2][n];
        for (int i = 0; i < n; i++) {
            answer[0][i] = preOrder.get(i);
            answer[1][i] = postOrder.get(i);
        }

        return answer;
    }

    // 노드 추가
    private void insertNode(TreeNode parent, TreeNode child) {
        if (child.x < parent.x) {  // 자식 노드의 값은 항상 부모 노드보다 작다
            if (parent.left == null) {
                parent.left = child;
            } else {
                insertNode(parent.left, child);
            }
        } else {  
            if (parent.right == null) {
                parent.right = child;
            } else {
                insertNode(parent.right, child);
            }
        }
    }

    private void preOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.index);  // V
        preOrder(node.left, result);  // L
        preOrder(node.right, result);  // R
    }

    private void postOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postOrder(node.left, result);  // L
        postOrder(node.right, result);  // R
        result.add(node.index);  // V
    }
}