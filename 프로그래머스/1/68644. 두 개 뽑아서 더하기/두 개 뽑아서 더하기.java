import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        /* 1번 풀이 
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        
        int[] result = new int[set.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }
        return result;
        */
        
        /* 2번 풀이 */
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        
    }
}