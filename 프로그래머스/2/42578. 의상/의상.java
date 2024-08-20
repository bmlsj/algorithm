import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> cloth = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            cloth.put(clothes[i][1], cloth.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for (String key : cloth.keySet()){
            answer *= cloth.get(key) + 1;
        }

        return answer - 1;
    }
}