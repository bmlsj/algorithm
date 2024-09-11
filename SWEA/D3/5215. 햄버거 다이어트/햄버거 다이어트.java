import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

	private static int n, l;
	static int[][] burgers;
	private static int maxNu;

	public static void main(String[] args) throws Exception {

		// System.setIn(new FileInputStream("5215_input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {

			String[] split = in.readLine().split(" ");
			n = Integer.parseInt(split[0]); // 재료의 수
			l = Integer.parseInt(split[1]); // 제한 칼로리

			burgers = new int[n][2];
			for (int i = 0; i < n; i++) {
				split = in.readLine().split(" ");
				burgers[i][0] = Integer.parseInt(split[0]);
				burgers[i][1] = Integer.parseInt(split[1]);
			}

			maxNu = 0;
			score(0, 0, 0);
			System.out.println("#" + t + " " + maxNu);
		}
	}

	private static void score(int idx, int currC, int currN) {

		if (currC > l) { // 제한 칼로리 넘었을 때
			return;
		}

		if (idx == n) {
			if (currN > maxNu) {
				maxNu = currN;
			}

			return;
		}

		// 햄버거 선택
		score(idx + 1, currC, currN);

		// 현재 햄버거 선택하지 않음
		score(idx + 1, currC + burgers[idx][1], currN + burgers[idx][0]);

	}

}