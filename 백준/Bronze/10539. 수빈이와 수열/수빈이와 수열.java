import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		int idx = 0;

		for (String input : br.readLine().split(" ")) {
			nums[idx++] = Integer.parseInt(input);
		}

		int sum = 0;
		int[] ans = new int[N];
		for(int i = 0; i < N; i++) {
			ans[i] = (i + 1) * nums[i] - sum;
			sum += ans[i];
		}
		
		for(int num: ans) {
			System.out.print(num + " ");
		}

	}

}