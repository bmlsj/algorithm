class Solution {
    public int[] solution(int[] arr) {
        
        int size = arr.length;
        int num = 1;
        
        while(num < size) {
            num *= 2;
        }
        
        int[] ans = new int[num];
        for(int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        
        return ans;
    }
}