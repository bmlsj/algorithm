class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num: array) {
            for(char n: (num + "").toCharArray()){
                if (n == '7') answer++;
            }
        }
        return answer;
    }
}