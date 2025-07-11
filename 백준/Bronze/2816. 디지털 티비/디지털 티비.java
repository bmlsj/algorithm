import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 1. 입력받으면서 channels 배열에 저장
 * 2. KBS1 위치를 찾고 → 커서를 이동(1) → KBS1이 맨 앞으로 올 때까지 이동(3)
 * 3. 그 이후, 현재 채널 배열에서 KBS2 위치를 다시 찾고 → 커서 이동(1) → 맨 앞으로 이동(3)
 */
public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int Kbs1Idx = 0, Kbs2Idx = 0;
		StringBuilder sb = new StringBuilder();
		String[] channels = new String[N];

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			channels[i] = input;

			if (input.equals("KBS1")) {
				Kbs1Idx = i;
			}

			if (channels[i].equals("KBS2")) {
				Kbs2Idx = i;
			}
		}

		// KBS1 위치로 커서 이동 + 위로 올리기
		for (int i = 0; i < Kbs1Idx; i++)
			sb.append("1");
		for (int i = 0; i < Kbs1Idx; i++)
			sb.append("4");

		if (Kbs2Idx < Kbs1Idx) {
			Kbs2Idx++;
		}

		// KBS2 위치로 커서 이동 + 위로 올리기
		for (int i = 0; i < Kbs2Idx; i++)
			sb.append("1");
		for (int i = 0; i < Kbs2Idx - 1; i++) // 2번째까지 올림
			sb.append("4");

		System.out.println(sb.toString());

	}

}