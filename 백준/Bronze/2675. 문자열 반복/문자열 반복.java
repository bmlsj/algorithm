import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			String[] split = br.readLine().split(" ");
			int cnt = Integer.parseInt(split[0]);
			String word = split[1];

			StringBuilder ans = new StringBuilder();

			for (char ch : word.toCharArray()) {
				for (int i = 0; i < cnt; i++) {
					ans.append(ch); // 문자를 cnt번 반복
				}
			}

			System.out.println(ans.toString());

		}

	}

}