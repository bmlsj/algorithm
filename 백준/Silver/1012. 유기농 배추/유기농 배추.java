import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {

    static boolean[][] visited;
    static int[][] map;
    static int n, m, k;

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        for (int t = 1; t <= T; t++) {
            String[] split = in.readLine().split(" ");
            n = Integer.parseInt(split[0]);
            m = Integer.parseInt(split[1]);
            k = Integer.parseInt(split[2]);

            map = new int[n][m];
            for (int i = 0; i < k; i++) {
                split = in.readLine().split(" ");
                int r = Integer.parseInt(split[0]);
                int c = Integer.parseInt(split[1]);
                map[r][c] = 1;

            }

            visited = new boolean[n][m];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }

    }

    static int[] dx = {-1, 0, 0, 1};  // 위, 왼, 오, 하
    static int[] dy = {0, -1, 1, 0};
    static int cnt = 0;

    private static void dfs(int x, int y) {


        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                continue;
            }

            if (!visited[nx][ny] && map[nx][ny] == 1) {
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }

    }


}