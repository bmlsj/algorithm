import java.util.*;
class Solution {
    
    static List<Integer>[] graph;
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        graph = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if (i != j && computers[i][j] == 1) {
                    graph[i].add(j);
                } 
            }
        }
        
        System.out.println(Arrays.toString(graph));
        visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    static void dfs(int v) {
        
        for(int next: graph[v]) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next);
            }
        }
    }
}