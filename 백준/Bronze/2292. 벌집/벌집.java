import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int step = 0;
		int num = 1;
		while (true) {
			
			step++;
			num += 6 * (step - 1);
			
			if (num >= N) {
				System.out.println(step);
				break;
			}
		}
	}

}