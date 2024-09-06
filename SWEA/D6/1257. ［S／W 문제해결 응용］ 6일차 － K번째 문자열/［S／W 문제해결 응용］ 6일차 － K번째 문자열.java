import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) throws Exception {

		// System.setIn(new FileInputStream("1257_input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {

			int k = Integer.parseInt(in.readLine());
			String string = in.readLine();
			char[] subStr = string.toCharArray();

			result = new TreeSet<>();
			split(subStr);

			int cnt = 0;
			String ans = "";
			System.out.print("#" + t + " ");
			for (String re : result) {
				if (cnt == k - 1) {
					ans = re;
					break;
				}
				cnt++;
			}

			System.out.println(ans.equals("") ? "none" : ans);

		}

	}

	static Set<String> result;

	private static void split(char[] subStr) {

		for (int i = 0; i < subStr.length; i++) {
			String temp = "";
			for (int j = i; j < subStr.length; j++) {
				temp += subStr[j];
				if (!result.contains(temp)) {
					result.add(temp); // 부분 문자열을 리스트에 추가
				}
			}
		}
	}

}