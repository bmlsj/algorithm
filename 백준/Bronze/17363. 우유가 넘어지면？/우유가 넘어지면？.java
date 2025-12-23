import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);

		char[][] mapHori = new char[N][M];
		char[][] mapVerti = new char[M][N];

		for (int i = 0; i < N; i++) {
		    String line = br.readLine();
		    for (int j = 0; j < M; j++) {
		        mapHori[i][j] = line.charAt(j);
		    }
		}

		for (int i = 0; i < M; i++) {
		    for (int j = 0; j < N; j++) {
		        char c = mapHori[j][M - 1 - i];
		        switch (c) {
		            case '-': mapVerti[i][j] = '|'; break;
		            case '|': mapVerti[i][j] = '-'; break;
		            case '/': mapVerti[i][j] = '\\'; break;
		            case '\\': mapVerti[i][j] = '/'; break;
		            case '^': mapVerti[i][j] = '<'; break;
		            case '<': mapVerti[i][j] = 'v'; break;
		            case 'v': mapVerti[i][j] = '>'; break;
		            case '>': mapVerti[i][j] = '^'; break;
		            default:  mapVerti[i][j] = c;
		        }
		    }
		}

		
		for(char[] map: mapVerti) {
			for(char m: map) {
				System.out.print(m);
			}
			System.out.println();
		}
	}

}