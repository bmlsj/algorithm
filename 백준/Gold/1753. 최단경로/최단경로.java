import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static class Node {
		public int vertex;
		public Node link;
		public int weight;

		public Node(int vertex, Node link, int weight) {
			super();
			this.vertex = vertex;
			this.link = link;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "Node [vertex=" + vertex + ", link=" + link + ", weight=" + weight + "]";
		}

	}

	private static final int INF = 9999999;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");

		int V = Integer.parseInt(split[0]);
		int E = Integer.parseInt(split[1]);

		int start = Integer.parseInt(in.readLine());

		Node[] adjList = new Node[V + 1];
		for (int i = 0; i < E; i++) {
			split = in.readLine().split(" ");
			int from = Integer.parseInt(split[0]);
			int to = Integer.parseInt(split[1]);
			int weight = Integer.parseInt(split[2]);

			adjList[from] = new Node(to, adjList[from], weight);
		}

		int[] distance = new int[V + 1];
		boolean[] visited = new boolean[V + 1];
		Arrays.fill(distance, INF);

		distance[start] = 0;

		int min = 0, curr = start;

		for (int cnt = 0; cnt < V + 1; cnt++) {
			curr = -1;
			min = INF;

			for (int i = 1; i < V + 1; i++) {
				if (!visited[i] && distance[i] < min) {
					min = distance[i];
					curr = i;
				}
			}

			if (curr == -1) {
				break;
			}

			visited[curr] = true;

			for (Node t = adjList[curr]; t != null; t = t.link) {
				if (!visited[t.vertex] && distance[t.vertex] > min + t.weight) {
					distance[t.vertex] = min + t.weight;
				}
			}
		}

		for (int i = 1; i <= V; i++) {
			System.out.println(distance[i] != INF ? distance[i] : "INF");
		}
		// System.out.println(Arrays.toString(distance));

	}
}