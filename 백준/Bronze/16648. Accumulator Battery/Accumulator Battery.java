import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");
		int t = Integer.parseInt(split[0]); // 이동시간
		int p = Integer.parseInt(split[1]); // 도착 시 배터리 잔량

		// 30분 동안 30% 소모
		// 20%되면 절전모드(소요시간 2배)
		// 50분 +

		double normalDrain = (100.0 - p) / t;
		double answer = 0.0;
		if (p > 20) {
            // 이동 중 절전모드 진입 X
            normalDrain = (100.0 - p) / t;

            answer = (p - 20) / normalDrain;
            answer += 20 / (normalDrain / 2);

        } else {
            // 이동 중 절전모드 진입 O
            normalDrain = (120.0 - 2 * p) / t;

            answer = p / (normalDrain / 2);
        }
		System.out.println(answer);

	}

}