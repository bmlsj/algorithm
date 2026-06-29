import java.util.*;
class Solution {
    
    static class Edge implements Comparable<Edge> {
        int to, cost;
        
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        List<List<Edge>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // 양방향 그래프 연결 정보 추가
        for(int[] edge: costs) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];
            
            graph.get(from).add(new Edge(to, cost));
            graph.get(to).add(new Edge(from, cost));
        }
        
        boolean[] visited = new boolean[n];
        
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(0, 0));
        
        int connected = 0;
        
        while(!pq.isEmpty()) {
            
            Edge curr = pq.poll();
            
            if (visited[curr.to]) continue;
            
            visited[curr.to] = true;
            answer += curr.cost;
            connected++;
            
            if (connected == n) break;
            
            for(Edge next: graph.get(curr.to)) {
                if (!visited[next.to]) {
                    pq.add(next);
                }
            }
        }
        
        return answer;
    }
}