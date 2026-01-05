import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String split = br.readLine();
		HashSet<Character> set = new HashSet<Character>();
		for(char ch: split.toCharArray()) {
			if (ch == 'M') set.add('M');
			if (ch == 'O') set.add('O');
			if (ch == 'B') set.add('B');
			if (ch == 'I') set.add('I'); 
			if (ch == 'S') set.add('S');
		}
		
		if (set.size() == 5) System.out.println("YES");
		else System.out.println("NO");
		
	}
	

}