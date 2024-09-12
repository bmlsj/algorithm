import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	private static int[][] map;
	private static boolean[][] visited;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 Set<String> set = new HashSet<>();
		int n = Integer.parseInt(in.readLine());
		
		String[] split = in.readLine().split(" ");
		for(int i = 0; i < n;i++) {
			set.add(split[i]);
		}
		
		int m = Integer.parseInt(in.readLine());
		split = in.readLine().split(" ");
		for(String num : split) {
			if (set.contains(num)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		

	}

}