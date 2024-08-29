import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {

	static int n, m;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		for (int t = 1; t <= T; t++) {

			n = Integer.parseInt(in.readLine());
			HashSet<Integer> set = new HashSet<>();
			int cnt = 1;
			int nn = n;
			while (true) {

				nn = n * (cnt++);
				for (String a : (nn + "").split("")) {
					set.add(Integer.parseInt(a));
				}

				if (set.size() == 10) {
					break;
				}

			}

			System.out.println("#" + t + " " + nn);

		}

	}

}