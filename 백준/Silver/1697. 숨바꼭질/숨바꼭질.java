import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	private static int n, k;
	private static boolean[] visited;
	private static int INF = 100001;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");
		n = Integer.parseInt(split[0]);
		k = Integer.parseInt(split[1]);

		visited = new boolean[INF];

		int ans = find(n);
		if (n == k) {
			ans = 0;
		}
		System.out.println(ans);
		// System.out.println(Arrays.toString(visited));

	}

	private static int[] dx = { -1, 1 };

	private static int find(int v) {

		Queue<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[] { v, 0 });
		visited[v] = true;

		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int p = curr[0];
			int time = curr[1];
			if (p == k) {
				return time;
			}

			for (int i = 0; i < 3; i++) {
				int x = 0;
				if (i < 2) {
					x = p + dx[i];
				} else {
					x = p * 2;
				}

				if (x >= INF || x < 0)
					continue;

				if (!visited[x]) {

					visited[x] = true;
					queue.offer(new int[] { x, time + 1 });
				}
			}
		}
		return -1;

	}

}