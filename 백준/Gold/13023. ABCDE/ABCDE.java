import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	private static int N, M;
	private static List<Integer>[] graph;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");
		N = Integer.parseInt(split[0]);
		M = Integer.parseInt(split[1]);

		graph = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {

			split = br.readLine().split(" ");

			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);

			graph[a].add(b);
			graph[b].add(a);
		}

		for (int i = 0; i < N; i++) {
			visited = new boolean[N];
			visited[i] = true;
			if (friend(i, 1)) {
				System.out.println(1);
				return;
			}
		}

		System.out.println(0);

	}

	static boolean[] visited;

	public static boolean friend(int v, int depth) {

		if (depth == 5) {
			return true;
		}

		
		for (int next : graph[v]) {
			if (!visited[next]) {
				visited[next] = true;
				if (friend(next, depth + 1)) {
					return true;
				}
				visited[next] = false;
			}
		}

		return false;

	}

}