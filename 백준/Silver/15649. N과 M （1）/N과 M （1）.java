import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static StringBuilder sb;
	private static int N;
	private static int R;
	private static int[] input;

	private static boolean[] isSelected; // 선택한 원소 관리
	private static int[] numbers; // 선택한 히나의 경우의 수

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");
		N = Integer.parseInt(split[0]);
		R = Integer.parseInt(split[1]);
		sb = new StringBuilder();

		input = new int[N];
		numbers = new int[R];
		isSelected = new boolean[N];
		for (int i = 0; i < N; i++) {
			input[i] = i + 1;
		}

		permutation(0);
		System.out.println(sb);

	}

	private static void permutation(int cnt) {
		
		if (cnt == R) {
			for (int number: numbers) {
				sb.append(number).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			if (isSelected[i]) {
				continue;
			}

			numbers[cnt] = input[i];
			isSelected[i] = true;

			permutation(cnt + 1);
			isSelected[i] = false;
		}

	}
}