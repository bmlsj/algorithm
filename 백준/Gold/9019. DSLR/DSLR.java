import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

	// D: n을 두배, n > 9999이면, n % 10000
	// S: n - 1, n=0이면 9999
	// L: n의 각 자릿수를 왼편으로 회전
	// R: n의 각 자리수를 오른편으로 회전

	static class Node {
		int num;
		String command;

		Node(int num, String command) {
			this.num = num;
			this.command = command;
		}
	}

	// nx는 매 연산마다 항상 초기 상태로부터 다시 계산할 것
	private static int A, B;
	private static char[] op = { 'D', 'S', 'L', 'R' };
	private static boolean[] visited;
	static String ans;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {

			String[] split = br.readLine().split(" ");

			A = Integer.parseInt(split[0]); // 초기 값
			B = Integer.parseInt(split[1]); // 최종 값

			ans = "";
			visited = new boolean[10000];
			convert(A, B);

		}

	}

	public static void convert(int n, int target) {

		visited[n] = true;
		Queue<Node> queue = new ArrayDeque<>();
		queue.offer(new Node(n, ""));

		while (!queue.isEmpty()) {

			Node node = queue.poll();
			n = node.num;
			String ans = node.command;

			for (int i = 0; i < 4; i++) {

				int nx = n;
				if (op[i] == 'D') {
					nx *= 2;
					if (nx > 9999)
						nx %= 10000;
				} else if (op[i] == 'S') {
					nx = (nx == 0) ? 9999 : nx - 1;
				} else if (op[i] == 'L') { // 1234 -> 2341
					nx = (nx % 1000) * 10 + (nx / 1000);
				} else if (op[i] == 'R') { // 1234 -> 4123
					nx = (nx % 10) * 1000 + nx / 10;
				}

				if (nx == target) {
					System.out.println(ans + op[i]);
					return;
				}

				if (!visited[nx]) {
					visited[nx] = true;
					queue.offer(new Node(nx, ans + op[i]));
				}
			}
		}

	}

}