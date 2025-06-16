import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		
		int ans = 0;
		for(String num: nums.split("")) {
			ans += Integer.parseInt(num);
		}
		
		System.out.println(ans);
		
		
	}

}