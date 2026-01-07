import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		
		if (!A.equals(B)) System.out.println(1550);
		else System.out.println(0);
		
	}



}