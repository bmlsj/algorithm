import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        int idx = 0;
        for(String[] names: photo) {
            
            int sum = 0;
            for(String n: names) {
                sum += map.getOrDefault(n, 0);
            }
            
            result[idx++] = sum;
        }
        
        return result;
    }
}