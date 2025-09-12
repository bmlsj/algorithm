import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] times = new int[N][2];

		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split(" ");

			int start = Integer.parseInt(split[0]);
			int end = Integer.parseInt(split[1]);

			times[i][0] = start;
			times[i][1] = end;

		}

		// 끝나는 시간이 빠른 순으로 정렬해야
		Arrays.sort(times, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				int cmp = Integer.compare(o1[1], o2[1]); // 오름차순

				if (cmp == 0) {
					return Integer.compare(o1[0], o2[0]);
				}

				return cmp;
			};
		});

		// System.out.println(Arrays.deepToString(times));

		int cnt = 1;
		int last = times[0][1];
		for (int i = 0; i < N - 1; i++) {
			if (last <= times[i + 1][0]) {
				// System.out.println(times[i + 1][0] + " " + times[i + 1][1]);
				last = times[i + 1][1];
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}