import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			
			String word = br.readLine();
			StringBuilder sb = new StringBuilder();
			sb.append(word.charAt(0));
			sb.append(word.charAt(word.length() - 1));
			
			System.out.println(sb);
		}

	}

}