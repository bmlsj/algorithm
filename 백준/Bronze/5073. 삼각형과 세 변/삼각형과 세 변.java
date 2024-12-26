import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String[] split = in.readLine().split(" ");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			int c = Integer.parseInt(split[2]);

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			// Invalid
			int[] values = { a, b, c };
			Arrays.sort(values);

			if (values[2] >= values[0] + values[1]) {
				System.out.println("Invalid");
			}

			// Equilateral
			else if (a == b && b == c && a == c) {
				System.out.println("Equilateral");
			}

			// Scalene
			else if (a != b && a != c && b != c) {
				System.out.println("Scalene");
			} else {
				System.out.println("Isosceles");
			}

		}

	}

}