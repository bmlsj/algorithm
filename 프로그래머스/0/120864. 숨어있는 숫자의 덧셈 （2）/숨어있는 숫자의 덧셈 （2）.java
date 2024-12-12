class Solution {
    public int solution(String str) {
        char[] chrs = str.toCharArray();

        int sum = 0;
        StringBuilder num = new StringBuilder();
        for(int i = 0; i < chrs.length;i++) {
            
            if (check(chrs[i])) {
                num.append(chrs[i]);
            } else if(num.length() > 0) {
                sum += Integer.parseInt(num.toString());
                num = new StringBuilder();
            }
        }
        if(num.length() > 0) {
                sum += Integer.parseInt(num.toString());
                num = new StringBuilder();
        }

        return sum;
    }
    
    static boolean check(char c) {
        return c >= '0' && c <= '9';
    }
}