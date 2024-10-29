import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int N, M;
    private static int[][] map;
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };
    private static boolean[][] visited, visitedPart;

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");

        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            split = in.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        int ans = 0;
        while (true) {

            // 빙산 녹는 양을 계산하여 tempMap에 저장
            int[][] tempMap = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] > 0) {
                        tempMap[i][j] = Math.max(0, map[i][j] - checkIce(i, j));
                    }
                }
            }

            // tempMap을 map에 복사하여 한 번에 업데이트
            for (int i = 0; i < N; i++) {
                map[i] = Arrays.copyOf(tempMap[i], M);
            }

            ans++;

            // 빙산 덩어리 개수 확인
            visitedPart = new boolean[N][M];
            int part = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] != 0 && !visitedPart[i][j]) {
                        checkPart(i, j); // 빙산 덩어리 탐색
                        part++;
                    }
                }
            }

            // 빙산이 분리된 경우 종료
            if (part > 1) {
                System.out.println(ans);
                break;
            }

            // 빙산이 모두 녹았는지 확인
            boolean allMelted = true;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] > 0) {
                        allMelted = false;
                        break;
                    }
                }
                if (!allMelted)
                    break;
            }

            // 모든 빙산이 녹았다면 종료
            if (allMelted) {
                System.out.println(0);
                break;
            }
        }
    }

    private static void checkPart(int x, int y) {
        visitedPart[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }

            if (!visitedPart[nx][ny] && map[nx][ny] != 0) {
                checkPart(nx, ny);
            }
        }
    }

    private static int checkIce(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }

            if (map[nx][ny] == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}