import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] parent;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");

		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);

		// 자기자신으로 부모 초기화
		parent = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < m; i++) {

			split = br.readLine().split(" ");
			int command = Integer.parseInt(split[0]);
			// 0: union
			// 1: find

			int u1 = Integer.parseInt(split[1]);
			int u2 = Integer.parseInt(split[2]);

			switch (command) {
			case 0:
				union(u1, u2);
				break;
			case 1:
				if (find(u1) == find(u2)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				break;
			}

		}

	}

	static void union(int u1, int u2) {

		int a = find(u1);
		int b = find(u2);

		if (a > b) { // 작은 경우를 대표로
			parent[a] = b;
		} else {
			parent[b] = a;
		}

	}

	static int find(int u) {

		if (parent[u] != u) { // 자기 자신이 대표가 아닐 경우
			parent[u] = find(parent[u]);
		}

		return parent[u];
	}
}