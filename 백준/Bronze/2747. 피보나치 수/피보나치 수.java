
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int first = 0;
		int second = 1;
		
		for(int i = 2; i <= n;i++) {
			int tmp = first + second;
			first = second;
			second = tmp;
		}
		
		System.out.println(second);
		
	}
	
}
