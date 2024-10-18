class Solution {
    public int[] solution(int n, int m) {
        int[] ans = new int[2];
        
        ans = minNum(n, m);
        
        return ans;
    }
    
    static int[] minNum(int n, int m) {
       
        // switch
        int tmp = 0;
        if(n > m) {
            tmp = n;
            n = m;
            m = tmp;
        }
        
        int ans = 0;
        for(int i = m; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                ans = i;
                break;
            }
        }
        
        return new int[]{ans, ans * (n/ans) * (m/ans)};
        
    }
   
}