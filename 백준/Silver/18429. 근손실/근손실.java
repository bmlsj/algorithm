import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	private static int n, k, ans = 0;
	private static int[] weight;
	private static int[] selected;
	private static boolean[] visited;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		weight = new int[n];
		st = new StringTokenizer(in.readLine());
		for (int i = 0; i < n; i++) {
			weight[i] = Integer.parseInt(st.nextToken());
		}

		visited = new boolean[n];
		selected = new int[n];
		perm(0, 500);

		System.out.println(ans);

	}

	private static void perm(int cnt, int start) {

		if (cnt == n) {
			// System.out.println(Arrays.toString(selected));
			for (int i = 0; i < n; i++) {
				start -= k;
				start += selected[i];

				if (start < 500) {
					return;
				}
			}
			ans++;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i])
				continue;
			visited[i] = true;
			selected[cnt] = weight[i];

			perm(cnt + 1, start);

			selected[cnt] = 0;
			visited[i] = false;
		}

	}

}