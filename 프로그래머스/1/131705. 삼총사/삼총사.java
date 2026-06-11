class Solution {
    
    static int ans;
    public int solution(int[] number) {
        ans = 0;        
        comb(number, 0, 0, 0);
        
        return ans;
    }
    
    static void comb(int[] number, int start, int cnt, int sum) {
        
        if (cnt == 3) {
            
            if (sum == 0) {
                ans++;
            }
            return;
        }
        
        for(int i = start; i < number.length; i++) {
            comb(number, i + 1, cnt + 1, sum + number[i]);
        }
    }
}