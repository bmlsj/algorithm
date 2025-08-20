import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

public class Main {

	static class Doc {
		int idx;
		int priority;

		Doc(int idx, int priority) {
			this.idx = idx;
			this.priority = priority;
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {

			String[] split = br.readLine().split(" ");
			int N = Integer.parseInt(split[0]);
			int M = Integer.parseInt(split[1]);

			split = br.readLine().split(" ");
			Deque<Doc> deque = new ArrayDeque<Doc>();
			for (int i = 0; i < N; i++) {
				deque.offer(new Doc(i, Integer.parseInt(split[i])));
			}

			int cnt = 0;
			while (!deque.isEmpty()) {

				Doc cur = deque.poll();

				boolean hasHigher = false;
				for (Doc d : deque) {
					if (d.priority > cur.priority) {
						hasHigher = true;
						break;
					}
				}

				if (hasHigher) {
					deque.offer(cur);
				} else {
					cnt++;
					if (cur.idx == M) {
						System.out.println(cnt);
						break;
					}
				}
			}

		}

	}

}