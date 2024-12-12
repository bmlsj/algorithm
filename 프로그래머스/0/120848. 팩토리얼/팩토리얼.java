class Solution {
    public int solution(int x) {
        int n = 1; 
        int factorial = 1; 
        
        while (factorial < x) {
            n++; 
            factorial *= n; 
        }
        
        if (factorial == x) {
            return n;
        } 
        return n-1;
    }
}
