import java.util.*;
class Solution {
    
    static int[][] visited;
    static int n, m;
    public int solution(int[][] maps) {
 
        n = maps.length;
        m = maps[0].length;
        
        visited = new int[n][m];
        move(0, 0, maps);
    
        return visited[n-1][m-1] == 0 ? -1 : visited[n-1][m-1];
    }
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static void move(int x, int y, int[][] maps) {
        
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = 1;
        
        while(!queue.isEmpty()) {
            
            int[] curr = queue.poll();
            x = curr[0];
            y = curr[1];
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                
                if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = visited[x][y] + 1;
                }
            }
        }
        
    }
}