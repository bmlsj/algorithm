class Solution {
    public int[] solution(int n) {
        int[] ans;
        
        if (n % 2 != 0) {
            ans = new int[n/2 + 1];
        } else {
            ans = new int[n/2];
        }
        
        for (int i = 0; i < ans.length; i++){
            ans[i] = i*2 + 1;
        }
        
        
        return ans;
    }
}