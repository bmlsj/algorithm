import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    static int[][] visited;
    static int[][] map;
    static int n, m;

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            split = in.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        visited = new int[n][m];
        visited[0][0] = 1;
        bfs(0, 0);
//        for(int[] v: visited) {
//            System.out.println(Arrays.toString(v));
//        }
        System.out.println(visited[n-1][m-1]);
    }

    static int[] dx = {-1, 0, 0, 1};  // 위, 왼, 오, 하
    static int[] dy = {0, -1, 1, 0};

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            x = tmp[0];
            y = tmp[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (visited[nx][ny] == 0 && map[nx][ny] == 1) {
                    visited[nx][ny] = visited[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }

        }

    }
}