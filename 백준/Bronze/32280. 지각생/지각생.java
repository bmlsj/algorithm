import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		int teacherTime = 0;
		List<Integer> students = new ArrayList<>();

		for (int i = 0; i <= t; i++) {
			String[] split = br.readLine().split(" ");
			int time = toMinute(split[0]);

			if (split[1].equals("teacher")) {
				teacherTime = time;
			} else {
				students.add(time);
			}
		}
		
		int schoolTime  = toMinute(br.readLine());
		int answer = 0;
		for(int st: students) {
			if (st >= schoolTime && st >= teacherTime) answer++;
		}
		
		
		System.out.println(answer);
	}

	private static int toMinute(String string) {
		String[] s = string.split(":");
		return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
	}

}