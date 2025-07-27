import java.util.*;

class Solution {
    
    static List<Integer>[] graph;
    static boolean[] visited;
    public int solution(int n, int[][] computers) {

        graph = new ArrayList[n+1];
        for(int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) { 
                if ( i != j && computers[i][j] == 1) {
                    graph[i+1].add(j+1);
                }
            }
        }
        
        int ans = 0;
        visited = new boolean[n+1];
        for(int i = 1; i <= n; i++) {
            if (!visited[i]) {
                networt(i);
                ans++;
            }
        }
        //System.out.println(Arrays.toString(graph));
        
        return ans;
    }
    
    static void networt(int v) {
        
        visited[v] = true;
        for (int nx: graph[v]) {
            if (!visited[nx]) {
                visited[nx] = true;
                networt(nx);
            }
        }
    }
}