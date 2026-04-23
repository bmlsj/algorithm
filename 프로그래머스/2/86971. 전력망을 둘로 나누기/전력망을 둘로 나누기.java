import java.util.*;

class Solution {
    
    static List<Integer>[] graph;
    static boolean[] visited;
    static int answer;
    public int solution(int n, int[][] wires) {
        answer = Integer.MAX_VALUE;
        
        graph = new ArrayList[n + 1];
        
        int idx = 0;
        while(idx < n) {
            
            for(int i = 0; i <= n; i++) {
                graph[i] = new ArrayList<Integer>();
            } 
  
            
            for(int i = 0; i < wires.length; i++) {
                if (i == idx) continue;
                int[] wire = wires[i];
                graph[wire[0]].add(wire[1]);
                graph[wire[1]].add(wire[0]);
            }
            
            visited = new boolean[n + 1];
            for(int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    cnt = 1;
                    visited[i] = true;
                    dfs(i);
                    answer = Math.min(answer, Math.abs(cnt - (n - cnt)));
                    // System.out.println(answer + " " + cnt + " " + (n - cnt));
                }
            }
            idx++;
        }
        
        return answer;
    }
    
    static int cnt;
    static void dfs(int node) {
        
        visited[node] = true;
        for(int next: graph[node]) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next);
                cnt++;
            }
        }
    }
}