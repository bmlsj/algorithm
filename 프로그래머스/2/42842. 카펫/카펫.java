class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                int innerW = i;
                int innerH = yellow / i;
                
                int w = innerW + 2;
                int h = innerH + 2;
                
                if (2 * w + 2 * h - 4 == brown) {
                    answer[0] = h;
                    answer[1] = w;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}