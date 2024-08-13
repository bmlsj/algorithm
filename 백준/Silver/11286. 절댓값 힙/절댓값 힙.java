import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				// 절댓값이 작은 순으로 정렬 + 값이 작은 값부터
				if (o1[1] > o2[1]) return 1;
				else if (o1[1] == o2[1]) 
					return o1[0] - o2[0];
				else return -1;
			}
		});

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(in.readLine());
			if (num != 0) {
				int[] tmp = new int[] { num, Math.abs(num) };
				queue.add(tmp);
				// System.out.println(Arrays.toString(tmp));
			} else {
				if (queue.isEmpty()) {
					System.out.println(0);
				} else {
					int[] tmp = queue.poll();
					System.out.println(tmp[0]);
				}
			}
		}
		
	}
}