
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			String[] split = br.readLine().split(" ");
			
			if (split[0].equals("top")) {
				if (st.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(st.peek());
				}
			} else if (split[0].equals("size")) {
				System.out.println(st.size());
			} else if (split[0].equals("empty")) {
				if (st.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (split[0].equals("pop")) {
				if (st.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(st.pop());
				}
				
			} else {
				st.add(Integer.parseInt(split[1]));
			}
			
			
		}

	}

}
