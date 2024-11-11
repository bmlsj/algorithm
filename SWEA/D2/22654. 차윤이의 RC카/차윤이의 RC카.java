import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    private static int N, Q, T;
    private static char[][] map;
    private static char[] command;

    private static int[] dx = { -1, 0, 1, 0 }; // 상우하좌
    private static int[] dy = { 0, 1, 0, -1 };

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(in.readLine());

        for (int t = 1; t <= T; t++) {
            StringBuilder sb = new StringBuilder();
            N = Integer.parseInt(in.readLine());
            map = new char[N][N];
            int sx = -1, sy = -1;

            for (int i = 0; i < N; i++) {
                String line = in.readLine();
                for (int j = 0; j < N; j++) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == 'X') {
                        sx = i;
                        sy = j;
                    }
                }
            }

            Q = Integer.parseInt(in.readLine());
            for (int i = 0; i < Q; i++) {
                String[] split = in.readLine().split(" ");
                command = split[1].toCharArray();

                int ans = go(command, sx, sy, 0);
                sb.append(ans).append(" ");
            }

            System.out.println("#" + t + " " + sb.toString());
        }
    }

    private static int go(char[] command, int x, int y, int dir) {
        for (int idx = 0; idx < command.length; idx++) {
            if (command[idx] == 'L') { // 왼쪽으로 90도 회전
                dir = (dir + 3) % 4;
            } else if (command[idx] == 'R') { // 오른쪽으로 90도 회전
                dir = (dir + 1) % 4;
            } else if (command[idx] == 'A') { // 앞으로 이동
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N || map[nx][ny] == 'T') {
                    continue;
                }

                x = nx;
                y = ny;
            }
        }
        
        // 모든 명령을 수행한 후, 목표 지점('Y')에 있는지 확인
        return map[x][y] == 'Y' ? 1 : 0;
    }
}