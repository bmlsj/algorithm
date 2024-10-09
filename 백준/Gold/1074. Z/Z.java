import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static int N, r, c;
	private static int result;
	private static int[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");

		N = (int) Math.pow(2,Integer.parseInt(split[0]));
		r = Integer.parseInt(split[1]);
		c = Integer.parseInt(split[2]);
		result = 0;
		start(0, 0, N );

		System.out.println(result);
	}

	private static void start(int x, int y, int size) {

		if (size == 1) {
			return;
		}

		int half = size / 2;

		if (r < x + half && c < y + half) { // 좌상

			start(x, y, half);

		} else if (r < x + half && c >= y + half) { // 우상

			result += half * half;
			start(x, y + half, half);

		} else if (r >= x + half && c < y + half) { // 좌하

			result += 2 * half * half;
			start(x + half, y, half);

		} else { // 우하

			result += 3 * half * half;
			start(x + half, y + half, half);

		}

	}

}