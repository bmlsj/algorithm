import java.util.*;
class Solution {

    static List<Integer>[] graph;
    static boolean[] visited;
    public int solution(int n, int[][] edge) {
        int answer = 0; 
        
        visited = new boolean[n+1];
        graph = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] e: edge) {
            int st = e[0];
            int ed = e[1];
            
            graph[st].add(ed);
            graph[ed].add(st);
        }
        nodes = new ArrayList<>();
        findNode(1, 0);
        
        int max = -1;
        for(int[] li: nodes) {
            //System.out.println(Arrays.toString(li));
            max = Math.max(max, li[1]);
        }
        
        for(int[] li: nodes) {
            if (li[1] == max) {
                answer++;
            }
        }
        
        
        return answer;
    }

    static List<int[]> nodes;
    static void findNode(int n, int cnt) {
        
        visited[n] = true;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{n, cnt});
        
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int now = curr[0];
            int dist = curr[1];

            for (int next : graph[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, dist + 1});
                    nodes.add(new int[]{next, dist + 1});
                }
            }
        }
    }
}