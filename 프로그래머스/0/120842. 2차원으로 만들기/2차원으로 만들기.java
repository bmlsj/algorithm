class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int idx = 0;
        int k = 0;
        while (idx < num_list.length / n) {
            for (int i = 0; i < n;i++){
                answer[idx][i] = num_list[k++];
            }
            idx++;
        }
        return answer;
    }
}