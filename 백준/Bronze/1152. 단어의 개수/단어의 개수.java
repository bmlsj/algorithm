import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// strip, trim 이 존재
// strip이 더 많은 종류의 공백 문자를 제거
public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		if (line.isBlank()) System.out.println(0);
		else {
			String[] arr = line.strip().split(" ");
			System.out.println(arr.length);
		}
	

	}

}