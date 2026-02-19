import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");
		String L = split[0];
		String R = split[1];

		// 길이가 다르면 무조건 0
		if (L.length() != R.length()) {
			System.out.println(0);
			return;
		}

		int ans = 0;

		for (int i = 0; i < L.length(); i++) {
			if (L.charAt(i) == R.charAt(i)) {
				if (L.charAt(i) == '8') {
					ans++;
				}
			} else {
				break;
			}
		}

		System.out.println(ans);

	}

}