import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");
		
		int n = Integer.parseInt(split[0]);
		int l = Integer.parseInt(split[1]); // 현재 길이
		split = in.readLine().split(" ");
		int[] nums = new int[n];
		
		for(int i = 0; i < n;i++) {
			nums[i] = Integer.parseInt(split[i]);
		}
		
		Arrays.sort(nums);
		// System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < n;i++) {
			if (nums[i] <= l) {
				l += 1;
			}
		}
		System.out.println(l);
	}

}