import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int N;
	private static int R;

	private static int[] input;
	private static int[] numbers;
	private static StringBuilder sb;

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");

		N = Integer.parseInt(split[0]);
		R = Integer.parseInt(split[1]);
		
		sb = new StringBuilder();
		input = new int[N];
		numbers = new int[R];

		for (int i = 0; i < N; i++) {
			input[i] = i + 1;
		}

		combination(0, 0);
		
		System.out.println(sb);
	}

	private static void combination(int cnt, int start) {

		if (cnt == R) {
			for (int num: numbers) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i < N; i++) {
			numbers[cnt] = input[i];
			combination(cnt + 1, i + 1);
		}

	}
}