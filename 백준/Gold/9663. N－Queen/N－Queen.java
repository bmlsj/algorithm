import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int n, ans = 0;
	private static boolean[] isCol, isDigo1, isDigo2;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(in.readLine());

		isCol = new boolean[n + 1];
		isDigo1 = new boolean[2 * n];
		isDigo2 = new boolean[2 * n];
		perm(0);

		System.out.println(ans);

	}

	private static void perm(int cnt) {

		if (cnt == n) {
			ans++;
			return;
		}

		for (int i = 0; i < n; i++) {
			if (isCol[i] || isDigo1[i + cnt] || isDigo2[cnt - i + (n - 1)]) {
				continue;
			}

			isCol[i] = true;
			isDigo1[i + cnt] = true;
			isDigo2[cnt - i + n - 1] = true;

			perm(cnt + 1);
			isCol[i] = false;
			isDigo1[i + cnt] = false;
			isDigo2[cnt - i + n - 1] = false;
		}

	}

}