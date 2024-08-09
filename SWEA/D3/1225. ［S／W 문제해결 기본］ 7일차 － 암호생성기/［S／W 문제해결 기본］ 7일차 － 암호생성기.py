import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

	public static void main(String args[]) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int test_case = 1; test_case <= 10; test_case++) {
			int n = Integer.parseInt(in.readLine());

			String[] split = in.readLine().split(" ");
			Queue<Integer> queue = new ArrayDeque<>();

			for (String s : split) {
				queue.offer(Integer.parseInt(s));
			}

			while (true) {
				boolean check = true;
				for (int i = 1; i <= 5; i++) {

					int first = queue.poll() - i;
					if (first <= 0) {
						queue.offer(0);
						check = false;
						break;
					} else {
						queue.offer(first);
					}

				}

				if (!check) {
					break;
				}

			}
			
			String ans = "";
			for (int q: queue) {
				ans += q + " ";
			}
			System.out.printf("#%d %s\n", n, ans);

		}
	}

}