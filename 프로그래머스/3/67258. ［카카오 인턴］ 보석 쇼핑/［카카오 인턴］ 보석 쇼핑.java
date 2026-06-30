import java.util.*;
class Solution {
    
    public int[] solution(String[] gems) {
    
        HashSet<String> set = new HashSet<>();
        for(String g: gems) {
            set.add(g);
        }
        
        int total = set.size();
        
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int ansStart = 0, ansEnd = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int right = 0; right < gems.length; right++) {
            String rightGem = gems[right];
            map.put(rightGem, map.getOrDefault(rightGem, 0) + 1);
            
            while(map.size() == total) {
                int curr = right - left;
                if (curr < minLen) {
                    minLen = curr;
                    ansStart = left + 1;
                    ansEnd = right + 1;
                }
                
                String leftGem = gems[left];
                map.put(leftGem, map.get(leftGem) - 1);
                
                if (map.get(leftGem) == 0) {
                    map.remove(leftGem);
                }
                
                left++;
            }
        }
        
        return new int[]{ansStart, ansEnd};
    }
}