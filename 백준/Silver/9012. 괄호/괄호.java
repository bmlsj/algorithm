import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
	
		for(int i = 0; i < n;i++) {
			char[] chars = br.readLine().toCharArray();
			Stack<Character> st = new Stack();
			
			for(char s: chars) {
				if (s == '(') {
					st.add(s);
				} else if (!st.isEmpty() && st.peek() == '(' && s == ')') {
					// 스택 top이 (고, )를 만나면 pop
					st.pop();
				} else {
					st.add(s);
				}
			}
			
			System.out.println(st.isEmpty() ? "YES" : "NO");
		}
		

	}

}