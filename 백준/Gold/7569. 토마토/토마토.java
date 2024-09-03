import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

class Main {

    static class Pair {
        int x, y, z;

        Pair(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static int[][][] map;
    static int n, m, k;
    static Queue<Pair> queue = new ArrayDeque<>();

    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {0, 0, 0, 0, -1, 1};
    static int[] dz = {-1, 1, 0, 0, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split(" ");
        n = Integer.parseInt(split[0]); // columns
        m = Integer.parseInt(split[1]); // rows
        k = Integer.parseInt(split[2]); // depth

        map = new int[m][n][k];
        for (int l = 0; l < k; l++) {
            for (int i = 0; i < m; i++) {
                split = in.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    map[i][j][l] = Integer.parseInt(split[j]);
                }
            }
        }

        // Initialize the queue with all starting points
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int r = 0; r < k; r++) {
                    if (map[i][j][r] == 1) {
                        queue.offer(new Pair(i, j, r));
                    }
                }
            }
        }

        bfs();

        int result = -1;
        boolean check = false;

        for (int[][] v : map) {
            for (int[] vv : v) {
                for (int vvv : vv) {
                    result = Math.max(result, vvv);
                    if (vvv == 0) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    break;
                }
            }
            if (check) {
                break;
            }
        }

        System.out.println(check ? -1 : result - 1);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();

            for (int i = 0; i < 6; i++) {
                int newX = curr.x + dx[i];
                int newY = curr.y + dy[i];
                int newZ = curr.z + dz[i];

                if (!in_range(newX, newY, newZ)) {
                    continue;
                }

                if (map[newX][newY][newZ] == -1) {
                    continue;
                }

                if (map[newX][newY][newZ] == 0) {
                    map[newX][newY][newZ] = map[curr.x][curr.y][curr.z] + 1;
                    queue.offer(new Pair(newX, newY, newZ));
                }
            }
        }
    }

    static boolean in_range(int x, int y, int z) {
        return 0 <= x && x < m && 0 <= y && y < n && 0 <= z && z < k;
    }
}