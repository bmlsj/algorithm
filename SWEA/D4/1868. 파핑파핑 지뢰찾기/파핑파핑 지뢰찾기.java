import java.util.*;

class Solution {
    static int n;
    static char[][] matrix;
    static int[] dx = {-1, 1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, -1, 1, 1, -1, 1, -1};
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            n = sc.nextInt();
            matrix = new char[n][n];
            for (int i = 0; i < n; i++) {
                String line = sc.next();
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = line.charAt(j);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '.') {
                        countBomb(i, j);
                    }
                }
            }

            int tmp = 0;
            cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '0') {
                        punkCnt(i, j);
                        tmp++;
                    }
                }
            }

            cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] != '*') {
                        cnt++;
                    }
                }
            }

            System.out.printf("#%d %d\n", t, tmp + cnt);
        }
    }

    static void countBomb(int x, int y) {
        int bombCount = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && matrix[nx][ny] == '*') {
                bombCount++;
            }
        }
        matrix[x][y] = (char) ('0' + bombCount);
    }

    static void punkCnt(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        matrix[x][y] = '*';

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int a = current[0];
            int b = current[1];

            for (int i = 0; i < 8; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (matrix[nx][ny] == '0') {
                        matrix[nx][ny] = '*';
                        q.add(new int[]{nx, ny});
                    } else if (matrix[nx][ny] != '*') {
                        matrix[nx][ny] = '*';
                        cnt++;
                    }
                }
            }
        }
    }
}