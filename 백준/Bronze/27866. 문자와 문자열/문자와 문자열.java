
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		int n = Integer.parseInt(br.readLine());

		char ans = sentence.charAt(n - 1);

		System.out.println(ans);

	}

}
