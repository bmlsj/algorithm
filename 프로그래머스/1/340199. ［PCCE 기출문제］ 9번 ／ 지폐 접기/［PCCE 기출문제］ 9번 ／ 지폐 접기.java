class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int minB = bill[0] > bill[1] ? bill[1] : bill[0];
        int minW = wallet[0] > wallet[1] ? wallet[1] : wallet[0];
        int maxB = bill[0] < bill[1] ? bill[1] : bill[0];
        int maxW = wallet[0] < wallet[1] ? wallet[1] : wallet[0];
        
        
        while(minB > minW || maxB > maxW) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
            minB = bill[0] > bill[1] ? bill[1] : bill[0];
            minW = wallet[0] > wallet[1] ? wallet[1] : wallet[0];
            maxB = bill[0] < bill[1] ? bill[1] : bill[0];
            maxW = wallet[0] < wallet[1] ? wallet[1] : wallet[0];
        }
        return answer;
    }
}