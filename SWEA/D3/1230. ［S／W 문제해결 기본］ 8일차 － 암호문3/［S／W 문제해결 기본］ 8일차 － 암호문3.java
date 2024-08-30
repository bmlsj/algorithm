import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) throws Exception {

		// System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {

			// Read the size of the original list
			int n = Integer.parseInt(in.readLine());
			List<String> passChange = new ArrayList<>();

			String[] split = in.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				passChange.add(split[i]);
			}

			// Read the number of operations
			int m = Integer.parseInt(in.readLine());
			split = in.readLine().split(" ");

			int idx = 0;
			for (int k = 0; k < m; k++) {
				String command = split[idx++];

				if (command.equals("I")) {
					int addIdx = Integer.parseInt(split[idx++]);
					int cnt = Integer.parseInt(split[idx++]);

					List<String> newElements = new ArrayList<>();
					for (int i = 0; i < cnt; i++) {
						newElements.add(split[idx++]);
					}

					passChange.addAll(addIdx, newElements);

				} else if (command.equals("D")) {
					int rmIdx = Integer.parseInt(split[idx++]);
					int cnt = Integer.parseInt(split[idx++]);

					for (int i = 0; i < cnt; i++) {
						passChange.remove(rmIdx);

					}

				} else if (command.equals("A")) {
					int cnt = Integer.parseInt(split[idx++]);

					for (int i = 0; i < cnt; i++) {
						String num = split[idx++];
						passChange.add(num);
					}

				}

			}

			System.out.print("#" + t);
			for (int i = 0; i < 10; i++) {
				System.out.print(" " + passChange.get(i));
			}
			System.out.println();

		}

	}

}