import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static int v, e;
	private static PriorityQueue<Edge> pre;
	static long min;

	static class Edge implements Comparable<Edge> {

		int s, e;
		int weight;

		public Edge(int s, int e, int weight) {
			this.e = e;
			this.s = s;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {

			return Integer.compare(weight, o.weight);
		}

	}

	static int[] parents;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");
		v = Integer.parseInt(split[0]);
		e = Integer.parseInt(split[1]);

		parents = new int[v + 1];
		pre = new PriorityQueue<>();

		StringTokenizer st;
		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(in.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			pre.offer(new Edge(s, e, w));
		}

		makeSet();

		int cnt = 0;

		while (!pre.isEmpty()) {

			Edge edge = pre.poll();
			if (union(edge.e, edge.s)) { // 연결할 수 있으면 true
				min += edge.weight;
				cnt++;

				if (cnt == v - 1)
					break;
			}
		}

		System.out.println(min);

	}

	private static boolean union(int from, int to) {

		from = find(from);
		to = find(to);

		if (from == to)
			return false;
		if (parents[from] > parents[to]) {
			parents[from] = to;
		} else {
			parents[to] = from;
		}

		return true;
	}

	private static int find(int v) {

		if (parents[v] == v)
			return v;
		else {
			return parents[v] = find(parents[v]);
		}

	}

	private static void makeSet() {
		for (int i = 1; i <= v; i++) {
			parents[i] = i;
		}
	}

}