
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Solution {

	private static int T, N, K;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {
			String[] split = in.readLine().split(" ");

			N = Integer.parseInt(split[0]); // 숫자 개수5
			K = Integer.parseInt(split[1]); // 크기 번째 수

			String nums = in.readLine();
			TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
			
			int len = N / 4;
			for (int i = 0; i < len; i++) {
				String tmp = "";
				for (int idx = 0; idx < N; idx += len) {

					tmp += nums.substring(idx, idx + len);

					set.add(Integer.parseInt(tmp, 16));
					tmp = "";

				}
				nums = nums.charAt(nums.length() - 1) + nums.substring(0, nums.length() - 1);

			}
			Iterator<Integer> it = set.iterator();
			int cnt = 1, result = 0;
			while (it.hasNext()) {
				result = it.next();
				if (cnt == K) {
					System.out.printf("#%d %d\n", t, result);
					break;
				}
				cnt++;
			}

		}

	}

}
