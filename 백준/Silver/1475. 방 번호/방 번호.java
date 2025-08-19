import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split("");

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i <= 9; i++) {
			map.put(i, 0);
		}

		for (String num : split) {
			int n = Integer.parseInt(num);

			if (n == 6) {
				if (map.get(n) > map.get(9)) {
					map.put(9, map.get(9) + 1);
				} else {
					map.put(n, map.get(n) + 1);
				}
			} else if (n == 9) {
				if (map.get(n) > map.get(6)) {
					map.put(6, map.get(6) + 1);
				} else {
					map.put(n, map.get(n) + 1);
				}
			} else {
				map.put(n, map.get(n) + 1);
			}
		}

		int ans = -1;
		for(int value: map.values()) {
			ans = Math.max(ans, value);
		}
		System.out.println(ans);
	}

}