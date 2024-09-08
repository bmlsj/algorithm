import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
1. 부분 집합 구하기
2. 두 그룹관 연결성 확인
3. 인구 차이 계산
4. 최소 인구 차이 찾기
 */
public class Main {

	private static int n, r;
	private static int[] population;
	private static int[] parents;
	private static List<Integer>[] link;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(in.readLine());
		population = new int[n]; // 인구수
		parents = new int[n];
		link = new ArrayList[n];

		String[] split = in.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			population[i] = Integer.parseInt(split[i]);
		}

		for (int i = 0; i < n; i++) {
			link[i] = new ArrayList<>();
		}

		// 인접 구역 수 : 인접 구역 번호
		for (int i = 0; i < n; i++) {
			split = in.readLine().split(" ");
			int cnt = Integer.parseInt(split[0]);
			for (int j = 1; j <= cnt; j++) {
				link[i].add(Integer.parseInt(split[j]) - 1);
			}
		}

		// System.out.println(1 << n);
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i < (1 << n) - 1; i++) {
			List<Integer> groupA = new ArrayList<Integer>();
			List<Integer> groupB = new ArrayList<Integer>();

			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					groupA.add(j);
				} else {
					groupB.add(j);
				}
			}

			if (isConneccted(groupA) && isConneccted(groupB)) {
				ans = Math.min(ans, calcuDiff(groupA, groupB));
			}
		}

		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);

	}

	// bfs : 그룹이 연결되어 있는지 확인하는 함수
	private static boolean isConneccted(List<Integer> group) {

		boolean[] visited = new boolean[n];
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(group.get(0));
		visited[group.get(0)] = true;
		int cnt = 1;

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			for (int next : link[curr]) {
				if (!visited[next] && group.contains(next)) {
					visited[next] = true;
					queue.add(next);
					cnt++;
				}
			}
		}

		return cnt == group.size(); // 모든 노드가 연결되었는지 확인
	}

	public static int calcuDiff(List<Integer> groupA, List<Integer> groupB) {

		int populA = 0, populB = 0;

		for (int g : groupA) {
			populA += population[g];
		}

		for (int g : groupB) {
			populB += population[g];
		}

		return Math.abs(populA - populB);
	}

}