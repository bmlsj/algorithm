import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	class Edge {
		int from, to;

		public Edge(int from, int to) {
			this.from = from;
			this.to = to;
		}
	}

	static int G, P;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		G = Integer.parseInt(in.readLine());
		P = Integer.parseInt(in.readLine());

		parents = new int[G + 1];

		makeSet();
		int ans = 0;
		for (int i = 0; i < P; i++) {
			int g = Integer.parseInt(in.readLine());
			int findGate = findSet(g);

			if (findGate == 0) {
				break;
			}

			ans++;
			union(findGate, findGate - 1);
		}
		
		System.out.println(ans);

	}

	static int[] parents;

	static boolean union(int from, int to) {

		from = findSet(from);
		to = findSet(to);

		if (from == to) {
			return false;
		}

		if (parents[from] > parents[to]) {
			parents[from] = to;
		} else {
			parents[to] = from;
		}

		return true;
	}

	static int findSet(int v) {

		if (parents[v] == v) {
			return v;
		} else {
			return parents[v] = findSet(parents[v]);
		}
	}

	static void makeSet() {

		for (int i = 1; i <= G; i++) {
			parents[i] = i;
		}
	}

}