import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {

    static class Pair {

        int x, y;

        Pair() {
        }

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

   // static int[][] visited;
    static int[][] map;
    static int n, m, k;

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);

        map = new int[m][n];
        for (int i = 0; i < m; i++) {
            split = in.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    queue.offer(new Pair(i, j));
                }
            }
        }

        bfs();
        int result = -1;
        boolean check = false;
        for (int[] v : map) {
            // System.out.println(Arrays.toString(v));
            for (int vv : v) {
                result = Math.max(result, vv);
                if (vv == 0) {
                    check = true;
                    break;
                }
            }
            if(check) {
                break;
            }
        }


        System.out.println(check ? -1 : result - 1);
    }


    static int[] dx = {-1, 0, 0, 1};  // 위, 왼, 오, 하
    static int[] dy = {0, -1, 1, 0};
    static Queue<Pair> queue = new ArrayDeque<>();

    private static void bfs() {

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newX = curr.x + dx[i];
                int newY = curr.y + dy[i];

                if (newX < 0 || newX >= m || newY < 0 || newY >= n) {
                    continue;
                }

                if (map[newX][newY] == 0) {
                    map[newX][newY] = map[curr.x][curr.y] + 1;
                    queue.offer(new Pair(newX, newY));

                }
            }
        }

    }
}