import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int P = Integer.parseInt(br.readLine());

		for (int p = 0; p < P; p++) {

			String[] split = br.readLine().split(" ");
			int T = Integer.parseInt(split[0]);

			int[] students = new int[split.length - 1];
			for (int i = 0; i < students.length; i++) {
				students[i] = Integer.parseInt(split[i + 1]);
			}

			int ans = stand(students);
			System.out.println((p + 1) + " " + ans);
		}

	}

	public static int stand(int[] students) {

		int cnt = 0;

		for (int i = 1; i < students.length; i++) {
			int key = students[i];
			int j = i - 1;

			// 이전 값이 더 크면, 데이터가 하나씩 밀려난다.
			while (j >= 0 && students[j] > key) {
				students[j + 1] = students[j];
				j--;
				cnt++;
			}

			students[j + 1] = key;
			
		}

		return cnt;

	}
}