class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i = 0; i < myString.length() - 1; i++) {
            String tmp = myString.charAt(i) + "";
            for(int j = i + 1; j < myString.length(); j++) {
                tmp += myString.charAt(j) + "";
                if (tmp.equals(pat)) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}