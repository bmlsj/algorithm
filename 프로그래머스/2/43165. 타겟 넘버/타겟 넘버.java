class Solution {
    
    static int cnt = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return cnt;
    }
    
    public static void dfs(int depth, int num, int[] numbers, int target) {
        
        if (depth == numbers.length) {
            if(num == target) {
                cnt++;
            }
            return;
        }
      
        dfs(depth + 1, num + numbers[depth], numbers, target);
        dfs(depth + 1, num - numbers[depth], numbers, target);

    }
}