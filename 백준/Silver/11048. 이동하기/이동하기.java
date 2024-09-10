import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n, m;
    private static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");

        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            split = in.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        // 1D DP 배열 생성
        long[] dp = new long[m];

        // 초기화: 첫 번째 행 처리
        dp[0] = map[0][0];
        for (int j = 1; j < m; j++) {
            dp[j] = dp[j - 1] + map[0][j];
        }

        // DP 배열 업데이트
        for (int i = 1; i < n; i++) {
            // 현재 행의 첫 번째 열 초기화
            dp[0] += map[i][0];
            for (int j = 1; j < m; j++) {
                dp[j] = Math.max(dp[j], dp[j - 1]) + map[i][j];
            }
        }

        // 결과 출력
        System.out.println(dp[m - 1]);
    }
}