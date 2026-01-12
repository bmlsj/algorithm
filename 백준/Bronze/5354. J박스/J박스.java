import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

	static int R, C;
	static char[][] map;
	static String[][] visited;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			String[][] map = new String[N][N];
			for (int i = 0; i < N; i++) {
				map[i][0] = "#";
				map[0][i] = "#";
				map[i][N - 1] = "#";
				map[N - 1][i] = "#";
			}

			for (int i = 1; i < N - 1; i++) {
				for (int j = 1; j < N - 1; j++) {
					map[i][j] = "J";
				}
			}

			for (String[] ma : map) {
				for (String m : ma) {
					System.out.print(m);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}