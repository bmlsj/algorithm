import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {

	private static int n, m;
	private static boolean[] visited;
	private static List<Integer>[] graph;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");
		n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);

		visited = new boolean[n + 1];
		graph = new ArrayList[n + 1];
		for (int i = 0; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			split = in.readLine().split(" ");
			int u = Integer.parseInt(split[0]);
			int v = Integer.parseInt(split[1]);
			graph[u].add(v);
			graph[v].add(u);

		}

		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				find(i);
				cnt++;
			}
		}
		System.out.println(cnt);

	}

	private static void find(int curr) {

		visited[curr] = true;
		for (int v : graph[curr]) {
			if (!visited[v]) {
				visited[v] = true;
				find(v);
			}
		}

	}

}