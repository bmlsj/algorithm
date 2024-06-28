class Solution {
    static boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        int pCnt = (int) s.chars()
                .filter(c -> String.valueOf((char) c).equals("p"))
                .count();

        int yCnt = (int) s.chars()
                .filter(c -> String.valueOf((char) c).equals("y"))
                .count();

        return pCnt == yCnt;
    }
}