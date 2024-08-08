import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	private static boolean[] visited;
	private static List<Integer>[] graph;
	private static int[] degree;
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 0; t < 10; t++) {

			String[] VE = in.readLine().split(" ");
			int V = Integer.parseInt(VE[0]);
			int E = Integer.parseInt(VE[1]);

			String[] split = in.readLine().split(" ");

			graph = new ArrayList[V + 1];
			degree = new int[V + 1];

			for (int i = 0; i <= V; i++) {
				graph[i] = new ArrayList<>();
			}

			for (int i = 0; i < split.length; i += 2) {
				int start = Integer.parseInt(split[i]);
				int next = Integer.parseInt(split[i + 1]);
				graph[start].add(next);
				degree[next]++;  // 차수 구하기
			}

			// System.out.println(Arrays.toString(degree));
			// System.out.println(Arrays.toString(graph));

			visited = new boolean[V + 1];
			System.out.print("#" + (t+1) + " ");
			for (int i = 1; i <= V; i++) {
			    if (degree[i] == 0 && !visited[i]) {
			        dfs(i);
			    }
			}
			
			System.out.println();
			// 8 9 4 1 5 2 3 7 6
			
		}

	}

	private static void dfs(int curr) {
		
		visited[curr] = true;
		
		System.out.print(curr + " ");
		for (int next: graph[curr]) {
			degree[next]--;
			if (degree[next] == 0 && !visited[next]) {
				dfs(next);
			}
		}
	}
}