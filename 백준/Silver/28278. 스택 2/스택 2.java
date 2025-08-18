import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			
			String[] split = br.readLine().split(" ");
			int cmd = Integer.parseInt(split[0]);
			int X = 0;
			
			if (split.length > 1) {
				X = Integer.parseInt(split[1]);
				st.add(X);
			}
			
			switch(cmd) {
			case 2:
				if (st.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(st.pop());
				}
				break;
			case 3:
				System.out.println(st.size());
				break;
			case 4:
				System.out.println((st.isEmpty() ? 1: 0));
				break;
			case 5:
				if (st.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(st.peek());
				}
				break;
			}
			
			
			
		}
		
				
	}

}