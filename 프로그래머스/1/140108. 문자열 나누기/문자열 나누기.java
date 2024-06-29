class Solution {
    public int solution(String s) {
        int ans = 0;
        int same = 0, diff = 0;
        String check = "";

        for (String c : s.split("")){
            if (same == diff) {
                ans++;
                check = c;
            }

            if (c.equals(check)) same++;
            else diff++;
        }
        return ans;
    }
}