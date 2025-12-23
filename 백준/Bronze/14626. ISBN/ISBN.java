import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split("");
		int idx = 0;
		int total = 0;
		for(int i = 0; i < split.length - 1; i++) {
			if (split[i].equals("*")) {
				idx = i;
			} else if (i % 2 == 0) {
				total += Integer.parseInt(split[i]);
			} else if (i % 2 == 1) {
				total += 3 * Integer.parseInt(split[i]);
			}
		}
		
		int m = Integer.parseInt(split[split.length - 1]);
		int x = 0;
		if (idx % 2 == 0) {
			x = (10 - (total + m) % 10) % 10;
		} else {
			x = ((10 - (total + m) % 10) * 7) % 10;
		}
		System.out.println(x);
	}

}