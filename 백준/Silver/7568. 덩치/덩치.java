import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] person = new int[N][2];

		for (int i = 0; i < N; i++) {

			String[] split = br.readLine().split(" ");
			int x = Integer.parseInt(split[0]); // kg
			int y = Integer.parseInt(split[1]); // cm

			person[i][0] = x;
			person[i][1] = y;

		}

		for (int i = 0; i < N; i++) {
			int cnt = 1;
			int[] stand = person[i];
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				if (stand[0] < person[j][0] && stand[1] < person[j][1]) {
					cnt++;
				}
			}

			System.out.print(cnt + " ");
		}

	}

}