import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
class Solution
{
    static int[][] rotate90(int[][] map, int n) {

        int[][] newMap = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(newMap[i], 0);
        }

        // 90도 회전
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMap[i][j] = map[n - j - 1][i];
            }
        }

        return newMap;
    }
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int[][] map = new int[n][n];

            // map 입력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int[][] map90 = rotate90(map, n);
            int[][] map180 = rotate90(map90, n);
            int[][] map270 = rotate90(map180, n);

            System.out.printf("#%d\n", t);
            String re = "";
            for (int i = 0; i < n; i++) {
                re = Arrays.stream(map90[i])
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining());

                System.out.print(re + " ");

                re = Arrays.stream(map180[i])
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining());

                System.out.print(re + " ");

                re = Arrays.stream(map270[i])
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining());

                System.out.println(re);
            }
        }
	}
}