import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");

		int a = Integer.parseInt(new StringBuilder().append(split[0]).reverse().toString());
		int b = Integer.parseInt(new StringBuilder().append(split[1]).reverse().toString());
		System.out.println(a > b ? a : b);

	}

}