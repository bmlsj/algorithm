class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int c1 = 0, c2 = 0;
        
        for (String g: goal){
            if (c1 < cards1.length && cards1[c1].equals(g)) {
                c1++;
            }
            else if (c2 < cards2.length && cards2[c2].equals(g)) {
                c2++;
            }
            else return "No";
        }
        
        return "Yes";
    }
}