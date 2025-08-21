import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		List<Character> list = new ArrayList<Character>();

		for (int t = 0; t < N; t++) {
			String input = br.readLine();
			char[] ch = input.toCharArray();

			if (list.isEmpty()) {
				for (char c : ch) {
					list.add(c);
				}
			} else {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) != ch[i]) {
						list.set(i, '?');
					}
				}
			}

		}
		
		String ans = "";
		for(char ch: list) {
			ans += ch;
		}
		System.out.println(ans);
	}

}