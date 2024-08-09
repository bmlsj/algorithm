import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	private static boolean[] visited;
	private static int[] arr;
	private static int INF = 100001;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] split = in.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int k = Integer.parseInt(split[1]);

		// x => 걷는다면 x-1, x+1
		// 순간 이동시 , x => 2x
		arr = new int[INF];
		visited = new boolean[INF];

		int res = bfs(n, k);
		System.out.println(res);

	}

	private static int bfs(int n, int k) {

		Queue<Integer> queue = new ArrayDeque<>();

		queue.offer(n);
		visited[n] = true;

		int curr = 0;

		while (!queue.isEmpty()) {
			curr = queue.poll();
			int[] dx = new int[] { -1, 1, curr };
			for (int i = 0; i < 3; i++) {
				int nx;
				if (i < 2) {
					nx = curr + dx[i];
				} else {
					nx = curr * 2;
				}
				if ((0 <= nx && nx < INF) && !visited[nx]) {
					arr[nx] = arr[curr] + 1;
					queue.add(nx);
					visited[nx] = true;
				}

				if (visited[k]) {
					return arr[k];
				}
			}

		}
		return -1;

	}
}