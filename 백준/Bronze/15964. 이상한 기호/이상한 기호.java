import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");

		int A = Integer.parseInt(split[0]);
		int B = Integer.parseInt(split[1]);

		// (a + b) * (a - b)
		System.out.println((A + B) * (A - B));

	}

}