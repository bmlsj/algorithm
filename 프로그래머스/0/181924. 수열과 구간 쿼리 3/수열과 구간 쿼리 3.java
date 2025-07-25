class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int[] query: queries) {
            int s = query[0];
            int e = query[1];
            
            int tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;
        }
        
        return arr;
    }
}