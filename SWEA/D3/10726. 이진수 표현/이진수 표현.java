import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {

	static int n, m;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		for (int t = 1; t <= T; t++) {
			String[] split = in.readLine().split(" ");

			n = Integer.parseInt(split[0]);
			m = Integer.parseInt(split[1]);
			String ans = "ON";

			String binary = String.format("%" + n + "s", Integer.toBinaryString(m)).replace(" ", "0");
			for (int i = binary.length() - n; i < binary.length(); i++) {
				if (binary.charAt(i) == '0') {
					ans = "OFF";
					break;
				}
			}

			System.out.println("#" + t + " " + ans);

		}

	}

}