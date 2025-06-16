import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dial = br.readLine();

		Map<Character, Integer> map = new HashMap<>();
		for (char c : "ABC".toCharArray()) map.put(c, 2);
		for (char c : "DEF".toCharArray()) map.put(c, 3);
		for (char c : "GHI".toCharArray()) map.put(c, 4);
		for (char c : "JKL".toCharArray()) map.put(c, 5);
		for (char c : "MNO".toCharArray()) map.put(c, 6);
		for (char c : "PQRS".toCharArray()) map.put(c, 7);
		for (char c : "TUV".toCharArray()) map.put(c, 8);
		for (char c : "WXYZ".toCharArray()) map.put(c, 9);


		int ans = 0;
		for (char ch : dial.toCharArray()) {
			if (map.containsKey(ch)) {
				ans += map.get(ch) + 1;
			}
		}
		
		System.out.println(ans);

	}

}