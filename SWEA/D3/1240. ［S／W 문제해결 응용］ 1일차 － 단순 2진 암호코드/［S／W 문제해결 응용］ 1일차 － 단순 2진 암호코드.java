import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

class Solution {

	static int n, m;
	static int[][] map;

	public static void main(String[] args) throws Exception {

		// System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {
			String[] split = in.readLine().split(" ");
			n = Integer.parseInt(split[0]);
			m = Integer.parseInt(split[1]); // start
			map = new int[n][m];

			for (int i = 0; i < n; i++) {
				split = in.readLine().split("");
				for (int j = 0; j < m; j++) {
					map[i][j] = Integer.parseInt(split[j]);
				}
			}

			List<String> list = new ArrayList<String>();
			int r = 0, c = 0;
			boolean check = false;
			for (int i = 0; i < n; i++) {

				int jdix = 1;
				for (int j = m - 1; j >= 0; j--) {
					if (map[i][j] == 1) {
						r = i;
						c = j;
						check = true;
						break;
					}
				}

				if (check)
					break;

			}

			String ans = "";
			for (int i = r; i < r + 1; i++) {
				for (int j = c; j >= c - 56; j--) {
					ans += map[i][j];

					if (ans.length() == 7) {
						list.add(ans);
						ans = "";
					}

					if (list.size() == 8) {
						break;
					}
				}
			}

			// System.out.println(list);
			Map<String, Integer> scanner = new HashMap<>();

			scanner.put("0001101", 0);
			scanner.put("0011001", 1);
			scanner.put("0010011", 2);
			scanner.put("0111101", 3);
			scanner.put("0100011", 4);
			scanner.put("0110001", 5);
			scanner.put("0101111", 6);
			scanner.put("0111011", 7);
			scanner.put("0110111", 8);
			scanner.put("0001011", 9);

			Collections.reverse(list);
			// System.out.println(list);
			int odd = 0, even = 0;
			int idx = 0;
			for (String key : list) {
				String rekey = "";
				for (int i = key.length() - 1; i >= 0; i--) {
					rekey += key.charAt(i);
				}
				// System.out.print(rekey + " ");
				int val = scanner.get(rekey);
				if (idx % 2 == 0) {
					even += val;
				} else {
					odd += val;
				}
				idx++;
			}

			if ((even * 3 + odd) % 10 == 0) {
				System.out.println("#" + t + " " + (even + odd));
			} else {
				System.out.println("#" + t + " " + 0);
			}
		}

	}

}