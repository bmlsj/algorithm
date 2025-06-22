import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");

		int A = Integer.parseInt(split[0]);
		int P = Integer.parseInt(split[1]);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int curr = A;
		int idx = 0;
		
		while(!map.containsKey(curr)) {
			map.put(curr, idx++);  // 방문 순서
			curr = getNext(curr, P);
		}
		
		System.out.println(map.get(curr));

	}
	
	public static int getNext(int num, int p) {
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, p);
			num /= 10;
		}
		
		return sum;
	}

}