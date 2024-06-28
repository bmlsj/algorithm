class Solution {
    public String solution(String my_string, int[][] queries) {
    

        for (int[] index : queries) {
            StringBuilder sb = new StringBuilder();
            int s = index[0], e = index[1];
            for (int i = s; i <= e; i++){
                sb.append(my_string.charAt(i));
            }
            my_string = my_string.substring(0, s) + sb.reverse().toString() + my_string.substring(e+1);
        }

        return my_string;
    }
}