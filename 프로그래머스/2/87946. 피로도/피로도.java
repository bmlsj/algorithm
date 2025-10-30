import java.util.*;
class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        int[] index = new int[dungeons.length];
        for(int i = 0; i < dungeons.length; i++) {
            index[i] = i;
        }
        
        List<List<Integer>> result = new ArrayList<>();
        visited = new boolean[dungeons.length];
        sortIndex(index,  new ArrayList<>(), result);
        
        int ans = 0;
        for (List<Integer> p : result) {
            int cnt = 0;
            int kk = k;
            for(int num: p) {
                int min = dungeons[num][0];
                int used = dungeons[num][1];
                if (kk >= min) {
                    kk -= used;
                    cnt++;
                }
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
    static boolean[] visited;
    static void sortIndex(int[] index, List<Integer> current, List<List<Integer>> result) {
        
        if (current.size() == index.length) {
            result.add(new ArrayList<>(current));

            return;
        }
        
        for(int i = 0; i < index.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.add(index[i]);
                sortIndex(index, current, result);
                current.remove(current.size() - 1);
                visited[i] = false;
            }
        }
    }
}