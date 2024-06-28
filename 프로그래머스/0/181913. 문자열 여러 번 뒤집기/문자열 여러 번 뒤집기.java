class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] index : queries) {
            int s = index[0], e = index[1];
            my_string = reverse(my_string, s, e);
        }

        System.out.println(my_string);
        return my_string;
    }
    
    public static String reverse(String word, int s, int e) {

        char[] charArr = word.toCharArray();

        while (s < e) {
            swap(charArr, s, e);
            s++;
            e--;
        }
        return new String(charArr);
    }

    public static void swap(char[] charArr, int s, int e) {
        char tmp = charArr[s];
        charArr[s] = charArr[e];
        charArr[e] = tmp;
    }

}