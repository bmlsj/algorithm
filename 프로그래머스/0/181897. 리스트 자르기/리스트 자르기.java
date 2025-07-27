class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] ans = {};
        int a = slicer[0], b = slicer[1], c = slicer[2];
        
        switch(n) {
            case 1: // 0 ~ b
                ans = new int[b + 1];
                for(int i = 0; i <= b; i++) {
                    ans[i] = num_list[i];
                }
                break;
            case 2: // a부터 마지막까지
                ans = new int[num_list.length - a];
                int idx = 0;
                for(int i = a; i < num_list.length; i++) {
                    ans[idx++] = num_list[i];
                }
                break;
            case 3: // a부터 b까지
                ans = new int[b - a + 1];
                idx = 0;
                for(int i = a; i <= b; i++) {
                    ans[idx++] = num_list[i];
                }
                break;
            case 4: // a부터 b까지 c간격으로
                ans = new int[(int)((b - a) / 2) + 1];
                idx = 0;
                for(int i = a; i <= b; i += c) {
                    ans[idx++] = num_list[i];
                }
                break;
                
        }
        return ans;
    }
}