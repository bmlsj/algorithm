import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Solution {

	private static int[] parents;
	private static int n;
	private static double e;
	private static PriorityQueue<Edge> pre;

	static class Edge implements Comparable<Edge> {

		int from, to;
		double weight;

		public Edge(int from, int to, double weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {

			return Double.compare(this.weight, o.weight); // 오름차순
		}

	}

	public static void main(String[] args) throws Exception {

		// System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		StringTokenizer st;

		for (int t = 1; t <= T; t++) {

			n = Integer.parseInt(in.readLine());
			pre = new PriorityQueue<Edge>();
			parents = new int[n];

			st = new StringTokenizer(in.readLine());
			int[] x = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(in.readLine());
			int[] y = new int[n];
			for (int i = 0; i < n; i++) {
				y[i] = Integer.parseInt(st.nextToken());
			}

			// 모든 좌표 쌍에 대해 거리 계산해 간선 추가
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					double distance = Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2);
					pre.offer(new Edge(i, j, distance));
				}

			}

			e = Double.parseDouble(in.readLine()); // 환경 부담 세율
			// 지불 금액 = E * L^2

			makeSet();

			double cost = 0.0;
			//int edgeCnt = 0;
			while (!pre.isEmpty()) {

				Edge edge = pre.poll();
				if (union(edge.from, edge.to)) {
					cost += e * edge.weight;
					//edgeCnt++;
				}
			}

			System.out.printf("#%d %.0f\n", t, cost);

		}
	}

	private static void makeSet() {

		for (int i = 0; i < n; i++) {
			parents[i] = i;
		}
	}

	private static int find(int v) {
		if (parents[v] == v) {
			return v;
		} else {
			return parents[v] = find(parents[v]);
		}
	}

	private static boolean union(int from, int to) {

		from = find(from);
		to = find(to);

		if (from == to) {
			return false;
		}
		parents[from] = to;

		return true;
	}

}