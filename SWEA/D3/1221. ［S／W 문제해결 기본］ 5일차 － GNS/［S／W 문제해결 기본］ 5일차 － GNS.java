import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {

		// System.setIn(new FileInputStream("1221_input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		Map<String, Integer> map = new HashMap<>();
		map.put("ZRO", 0);
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THR", 3);
		map.put("FOR", 4);
		map.put("FIV", 5);
		map.put("SIX", 6);
		map.put("SVN", 7);
		map.put("EGT", 8);
		map.put("NIN", 9);

		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine());

			String tc = st.nextToken();
			int n = Integer.parseInt(st.nextToken());

			int[] nums = new int[n];
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < n; i++) {
				int value = map.get(st.nextToken());
				nums[i] = value;
			}

			Arrays.sort(nums);
			// System.out.println(Arrays.toString(nums));
			String[] strNums = new String[n];

			for (int i = 0; i < n; i++) {
				for (Entry<String, Integer> elem : map.entrySet()) {
					if (elem.getValue() != null && elem.getValue() == nums[i]) {
						strNums[i] = elem.getKey();
						break;
					}
				}

			}
			System.out.println(tc);
			for (String s : strNums) {
				System.out.print(s + " ");
			}

		}

	}

}