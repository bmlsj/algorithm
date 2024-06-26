import java.util.Scanner;

class Solution {

    static int digo(int[][] map, int n, int m) {
        int cnt, res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cnt = map[i][j];
                for (int k = 1; k < m; k++) {
                    if (i + k < n && j + k < n) cnt += map[i + k][j + k];
                    if (i + k < n && j - k >= 0) cnt += map[i + k][j - k];
                    if (i - k >= 0 && j + k < n) cnt += map[i - k][j + k];
                    if (i - k >= 0 && j - k >= 0) cnt += map[i - k][j - k];
                }
                res = Math.max(res, cnt);
            }
        }

        return res;
    }

    static int linear(int[][] map, int n, int m) {
        int cnt, res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cnt = map[i][j];
                for (int k = 1; k < m; k++) {
                    if (i + k < n) cnt += map[i + k][j];
                    if (j - k >= 0) cnt += map[i][j - k];
                    if (i - k >= 0) cnt += map[i - k][j];
                    if (j + k < n) cnt += map[i][j + k];
                }
                res = Math.max(res, cnt);
            }
        }

        return res;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] map = new int[n][n];  // nxn 배열

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }


            System.out.printf("#%d %d\n", t + 1, Math.max(digo(map, n, m), linear(map, n, m)));
        }
        sc.close();
    }
}