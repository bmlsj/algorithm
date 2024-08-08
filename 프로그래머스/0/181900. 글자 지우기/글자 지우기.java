import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        String ans = "";
        Arrays.sort(indices);
        
        for (int i = 0; i < indices.length; i++){
            str[indices[i]] = "";
        }
        
        for (int i = 0; i < str.length;i++){
            ans += str[i];
        }
        return ans;
    }
}