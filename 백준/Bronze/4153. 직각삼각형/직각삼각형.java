import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] split = br.readLine().split(" ");
			int[] nums = new int[3];
			for (int i = 0; i < 3; i++) {
				nums[i] = Integer.parseInt(split[i]);
			}
			
			if (nums[0] == 0) break;

			Arrays.sort(nums);
			if (nums[0] * nums[0] + nums[1] * nums[1] == nums[2] * nums[2]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

	}

}