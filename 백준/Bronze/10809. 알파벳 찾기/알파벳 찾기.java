import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] words = br.readLine().toCharArray();

		String ans = "";

		for (char ch = 'a'; ch <= 'z'; ch++) {
			boolean check = false;
			for (int i = 0; i < words.length; i++) {

				if (ch == words[i]) {
					ans += i + " ";
					check = true;
					break;
				}
			}

			if (!check)
				ans += "-1 ";
		}

		System.out.println(ans);

	}

}