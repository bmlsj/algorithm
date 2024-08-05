import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        HashMap<String, int[]> map = new HashMap<>();
        map.put("U", new int[]{0, 1});
        map.put("D", new int[]{0, -1});
        map.put("R", new int[]{1, 0});
        map.put("L", new int[]{-1, 0});
        
        int x = 0, y = 0;
        HashSet<String> set = new HashSet<>();
        
        for (String dir : dirs.split("")) {
            
            int[] move = map.get(dir);
            int nx = x + move[0], ny = y + move[1];
            
            if (Math.abs(nx) < 6 &&  Math.abs(ny) < 6){
                String path1 = x + "," + y + "," + nx + "," + ny;
                String path2 = nx + "," + ny + "," + x + "," + y;
                set.add(path1);
                set.add(path2);
                x = nx;
                y = ny;
            }
        }
        
        return set.size() / 2;
    }
}