import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        
       	Queue<Node> queue = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < priorities.length; i++) {
			queue.offer(new Node(priorities[i], i));
			pq.offer(priorities[i]);
		}

		int ans = 0;
		while (!queue.isEmpty()) {
			Node curr = queue.poll();

			// 현재 문서가 가장 높은 우선순위 인지
			if (curr.prior == pq.peek()) {
				pq.poll();
				ans++;

				if (curr.idx == location) {
					return ans;
				}
			} else { // 높은 우선순위가 있을 때
				queue.offer(curr);

			}
		}

		return ans;
	}

	static class Node {
		int prior;
		int idx;

		Node(int prior, int idx) {
			this.prior = prior;
			this.idx = idx;
		}
	}

}