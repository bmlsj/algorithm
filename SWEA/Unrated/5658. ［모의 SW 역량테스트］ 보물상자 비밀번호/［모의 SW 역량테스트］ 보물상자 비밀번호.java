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

			// 각 회전에서 가능한 16진수 값을 저장
			int len = N / 4; // 각 부분 문자열의 길이

			for (int i = 0; i < len; i++) { // N/4번 회전
				for (int j = 0; j < 4; j++) {
					// 부분 문자열을 16진수로 변환하여 추가
					String tmp = nums.substring(j * len, (j + 1) * len);
					set.add(Integer.parseInt(tmp, 16));
				}
				// 문자열을 회전
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
