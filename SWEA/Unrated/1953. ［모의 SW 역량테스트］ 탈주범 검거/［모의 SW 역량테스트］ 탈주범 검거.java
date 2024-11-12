import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int N, M, R, C, L;
    static int map[][];
    static int visited[][];
    static int ans;
    static boolean tunnel[][] = { { false, false, false, false }, { true, true, true, true },
            { true, true, false, false }, { false, false, true, true }, { true, false, false, true },
            { false, true, false, true }, { false, true, true, false }, { true, false, true, false } };

    static int dx[] = { -1, 1, 0, 0 }; // 상, 하, 좌, 우
    static int dy[] = { 0, 0, -1, 1 };

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(in.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append("#" + test_case + " ");

            String[] value = in.readLine().split(" ");

            N = Integer.parseInt(value[0]);
            M = Integer.parseInt(value[1]);
            R = Integer.parseInt(value[2]);
            C = Integer.parseInt(value[3]);
            L = Integer.parseInt(value[4]);

            map = new int[N][M];
            visited = new int[N][M];

            for (int i = 0; i < N; i++) {
                String[] line = in.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(line[j]);
                }
            }
            ans = 0;
            solve(R, C);
            sb.append(ans + "\n");
        }

        System.out.println(sb);
    }

    private static void solve(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { x, y });
        visited[x][y] = 1;
        ans++;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            x = curr[0];
            y = curr[1];

            if (visited[x][y] == L)
                return;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M)
                    continue;
                if (visited[nx][ny] > 0 || map[nx][ny] == 0)
                    continue;

                if ((i == 0 && tunnel[map[x][y]][0] && tunnel[map[nx][ny]][1])
                        || (i == 1 && tunnel[map[x][y]][1] && tunnel[map[nx][ny]][0])
                        || (i == 2 && tunnel[map[x][y]][2] && tunnel[map[nx][ny]][3])
                        || (i == 3 && tunnel[map[x][y]][3] && tunnel[map[nx][ny]][2])) {
                    queue.offer(new int[] { nx, ny });
                    visited[nx][ny] = visited[x][y] + 1;
                    ans++;
                }
            }
        }
    }
}