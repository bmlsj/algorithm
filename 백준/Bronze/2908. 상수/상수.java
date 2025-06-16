import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");

		String first = "";
		String second = "";

		for (int i = split[0].length() - 1; i >= 0; i--) {
			first += split[0].charAt(i);
		}

		for (int i = split[1].length() - 1; i >= 0; i--) {
			second += split[1].charAt(i);
		}

		int a = Integer.parseInt(first);
		int b = Integer.parseInt(second);

		System.out.println(a > b ? a : b);
	}

}