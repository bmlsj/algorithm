import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// 0을 쓰면, 수를 지움
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack();
		
		for(int i = 0; i < n; i++) {
			
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				st.pop();
			} else {
				st.add(num);
			}
		}
		
		int ans = 0;
		for(int a: st) {
			ans += a;
		}
		System.out.println(ans);
	
	}

}
