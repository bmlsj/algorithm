import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int[][] map;
	static boolean[] visited;
	static int[] team1;
	static int[] team2;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(in.readLine());
		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// System.out.println(Arrays.deepToString(map));
		team1 = new int[n / 2];
		team2 = new int[n / 2];
		visited = new boolean[n + 1];
		combi(1, 0);
		
		System.out.println(min);
	}

	static int min = 10000;

	public static void combi(int start, int cnt) {

		if (cnt == n / 2) {
			// System.out.println("team1: " + Arrays.toString(team1));

			int idx = 0;
			for (int i = 1; i <= n; i++) {
				if (!visited[i]) { // team1에 없는 값 team2 에 넣기
					team2[idx++] = i;
				}
			}
			// System.out.println("team2: " + Arrays.toString(team2));

			int power1 = calcPower(team1);
			int power2 = calcPower(team2);
			min = Math.min(min, Math.abs(power1 - power2));
			return;
		}

		for (int i = start; i <= n; i++) {
			visited[i] = true;
			team1[cnt] = i;
			combi(i + 1, cnt + 1);
			visited[i] = false;
			team1[cnt] = 0;
		}
	}

	// 주어진 팀의 파워를 계산하는 함수
	public static int calcPower(int[] team) {
		int power = 0;
		for (int i = 0; i < team.length - 1; i++) {
			for (int j = i + 1; j < team.length; j++) {
				power += map[team[i] - 1][team[j] - 1]; // map은 0-based이므로 -1
				power += map[team[j] - 1][team[i] - 1];
			}
		}
		return power;
	}

}