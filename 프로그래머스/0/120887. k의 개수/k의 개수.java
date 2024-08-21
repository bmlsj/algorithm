class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String ks = k + "";
        for (int a = i; a <= j; a++){
            String tmp = a + "";
            for(String t: tmp.split("")){
                if (t.equals(ks)){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}