

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

	private static int T, N, ans;
	private static int[] map;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {

			N = Integer.parseInt(in.readLine());
			map = new int[N];

			ans = 0;
			dfs(0);

			System.out.printf("#%d %d\n", t, ans);
		}

	}


	private static void dfs(int depth) {

		if (depth == N) {
			ans++;
			return;
		}

		for (int i = 0; i < N; i++) {
			map[depth] = i;
			if (isPossible(depth)) {
				dfs(depth + 1);
			}
		}

	}

	private static boolean isPossible(int col) {

		for (int i = 0; i < col; i++) {
			if (map[i] == map[col]) { // 행에 퀸이 있는 지 확인
				return false;
			} else if (Math.abs(col - i) == Math.abs(map[col] - map[i])) {
				return false;
			}
		}
		return true;
	}

}
