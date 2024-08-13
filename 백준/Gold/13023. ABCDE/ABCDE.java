import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	private static boolean[] visited;
	private static int max = -1;
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		List<Integer>[] friends = new ArrayList[a];

		for (int i = 0; i < a; i++) {
			friends[i] = new ArrayList<>();
		}

		for (int i = 0; i < b; i++) {
			split = in.readLine().split(" ");
			friends[Integer.parseInt(split[0])].add(Integer.parseInt(split[1]));
			friends[Integer.parseInt(split[1])].add(Integer.parseInt(split[0]));
		}

		// System.out.println(Arrays.deepToString(friends));

		for (int i = 0; i < a; i++) {
			visited = new boolean[a];
			depth(friends, i, 0);
		}
		// System.out.println(max);
		System.out.println(max >= 4? 1 : 0);

	}

	private static void depth(List<Integer>[] friends, int curr, int d) {

		visited[curr] = true;
		for (int next : friends[curr]) {
			if (!visited[next]) {
				visited[next] = true;
				depth(friends, next, d + 1);
				visited[next] = false;
				// System.out.println(curr + " " + next+" "+ d);
			}
			max = Math.max(max, d);
			if (max >= 4) return;
		}

	}

}