import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int[] map;
	private static int[] visited;
	private static int F, S, G, U, D;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		F = Integer.parseInt(st.nextToken()); // 최고 높이
		S = Integer.parseInt(st.nextToken()); // 강호 위치
		G = Integer.parseInt(st.nextToken()); // 링크 위치
		U = Integer.parseInt(st.nextToken()); // 위로 이동
		D = Integer.parseInt(st.nextToken()); // 아래 이동

		map = new int[F + 1];
		visited = new int[F + 1];

		int ans = elevator(S);
		System.out.println(ans == -1 ? "use the stairs" : ans);

	}

	private static int elevator(int s) {

		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(s);
		visited[s] = 1;

		while (!queue.isEmpty()) {
			s = queue.poll();

			if (s == G) {
				return visited[s] - 1;
			}
			
			int[] move = new int[] { U, -D };
			for (int i = 0; i < 2; i++) {
				int ms = s + move[i];

				if (ms >= 1 && ms <= F && visited[ms] == 0) {
					visited[ms] = visited[s] + 1;
					queue.offer(ms);
				}
			}
		}
		
		return -1;

	}

}