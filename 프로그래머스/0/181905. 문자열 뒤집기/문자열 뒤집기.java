class Solution {
    public String solution(String my_string, int s, int e) {
        String rev = "";
        String[] str = my_string.split("");
        
        for (int i = e; i >= s; i--) {
            rev += str[i];
        }
        
        return my_string.substring(0, s) + rev + my_string.substring(e+1);
    }
}