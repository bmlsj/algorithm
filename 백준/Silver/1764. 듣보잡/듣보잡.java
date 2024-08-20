import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]); // 최대 치킨 집

		HashMap<String, Integer> names = new HashMap<String, Integer>();

		for (int i = 0; i < n + m; i++) {
			String sp = in.readLine();
			names.put(sp, names.getOrDefault(sp, 0) + 1);
		}

		int ans = 0;
		List<String> ansName = new ArrayList<>();
		for (String name : names.keySet()) {
			if (names.get(name) > 1) {
				ansName.add(name);
				ans++;
			}
		}

		Collections.sort(ansName);
		System.out.println(ans);
		for (String name : ansName) {
			System.out.println(name);
		}

	}

}