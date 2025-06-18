import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");
		int x = Integer.parseInt(split[0]);
		int y = Integer.parseInt(split[1]);
		
		int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int days = y;
		for(int i = 0; i < x - 1; i++) {
			days += year[i];
		}
		
		System.out.println(week[days % 7]);		
		

	}

}