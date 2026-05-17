import java.util.*;
class Solution {
    
    static TreeSet<Integer> set;
    public int solution(int[] elements) {
        int answer = 0;
        
        // Arrays.sort(elements);
        set = new TreeSet<>();
        
        for(int i = 1; i <= elements.length; i++) {
            calc(i, elements);
        }
        
        // System.out.println(set);
        return set.size();
    }
    
    static void calc(int size, int[] elements) {

        for(int i = 0; i < elements.length; i++) {
            int num = elements[i];
            for(int j = i + 1; j < i + size; j++) {
                num += elements[j % elements.length];
            }
            set.add(num);
        }
    }
}