import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    private static int T;
    private static int[] dx = { 1, 0, -1, 0 }; // x 방향으로의 이동 (오른쪽, 아래, 왼쪽, 위)
    private static int[] dy = { 0, 1, 0, -1 }; // y 방향으로의 이동
    private static int direction; // 방향 (0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위)

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(in.readLine());

        for (int t = 1; t <= T; t++) {
            String commands = in.readLine();
            
            // 초기화
            direction = 0;
            int x = 0, y = 0;
            int maxDistanceSquared = 0; // 최대 거리의 제곱
            
            boolean isInfinite = false;
            
            // 주어진 명령을 반복하며 위치를 업데이트
            for (int i = 0; i < 4; i++) { // 명령어를 4번까지 반복하며 패턴을 확인
                for (char command : commands.toCharArray()) {
                    if (command == 'S') {
                        x += dx[direction];
                        y += dy[direction];
                    } else if (command == 'L') {
                        direction = (direction + 3) % 4; // 왼쪽 회전
                    } else if (command == 'R') {
                        direction = (direction + 1) % 4; // 오른쪽 회전
                    }
                    
                    // 현재 위치에서 원점까지의 거리의 제곱을 계산
                    int distanceSquared = x * x + y * y;
                    maxDistanceSquared = Math.max(maxDistanceSquared, distanceSquared);
                }
                
                // 한 주기가 끝난 후 원점에 돌아오고 방향이 초기 방향과 같으면 유한 거리
                if (x == 0 && y == 0 && direction == 0) {
                    isInfinite = false;
                    break;
                }
                isInfinite = true;
            }
            
            // 결과 출력
            System.out.printf("#%d %s\n", t, isInfinite ? "oo" : maxDistanceSquared);
        }
    }
}