class Solution {
    public int solution(int n) {
        int numOnes = Integer.bitCount(n); // n의 1의 개수를 미리 구함
        
        while (true) {
            n++;
            if (Integer.bitCount(n) == numOnes) { // 다음 숫자에서 1의 개수가 같으면 리턴
                return n;
            }
        }
    }
}