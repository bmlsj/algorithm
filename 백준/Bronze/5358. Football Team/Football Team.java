import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringBuilder sb = new StringBuilder();

			char[] chlist = line.toCharArray();
			for (char ch : chlist) {
				if (ch == 'i')
					sb.append('e');
				else if (ch == 'e')
					sb.append('i');
				else if (ch == 'I')
					sb.append('E');
				else if (ch == 'E')
					sb.append('I');
				else
					sb.append(ch);
			}

			System.out.println(sb.toString());
		}
	}

}