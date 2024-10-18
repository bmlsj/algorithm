class Solution {
    public int solution(int[] num_list) {
        
        int ans = 0;
        for(int i = 0; i < num_list.length; i++) {
            ans += calcCnt(num_list[i]);
        }
        
        return ans;
    }
    
    public static int calcCnt(int num) {
        
        int cnt = 0;
        while(num > 1) {
            cnt++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
                num /= 2;
            }
        }
        
        return cnt;
        
    }
}