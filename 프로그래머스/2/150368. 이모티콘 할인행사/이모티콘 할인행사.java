class Solution {
    
    static int[] discount;
    static int[] answer;
    public int[] solution(int[][] users, int[] emoticons) {
        
        answer = new int[]{0, 0};  // [플러스 가입자, 판매액] 
        discount = new int[emoticons.length];
        dfs(0, users, emoticons);
        return answer;
    }
    
    static int[] buyEmoticons(int[][] users, int[] emoticons) {
        
        int plus = 0;
        int buy = 0;
        
        for(int i = 0; i < users.length; i++) {
            int d = users[i][0];  // 최소 할인율
            int subscribe = users[i][1];  // 임플 최소 금액
            
            int price = 0;
            for(int j = 0; j < discount.length; j++) {
                if (discount[j] >= d) {
                     price += (100 - discount[j]) * 0.01 * emoticons[j];
                }
            }            
            if (price >= subscribe) {  // 임플 구독
                plus++;
            } else {  // 구매액 증가
                buy += price;
            }
        }
        
        return new int[]{plus, buy};
    }
    
    static void dfs(int idx, int[][] users, int[] emoticons) {
        if (idx == emoticons.length) {
            int[] result = buyEmoticons(users, emoticons);
            
            if(answer[0] < result[0] || (answer[0] == result[0] && answer[1] < result[1])) {
                answer = result;
            }
            return;
        }
        
        for(int i = 40; i >= 10; i-= 10) {
            discount[idx] = i;
            dfs(idx + 1, users, emoticons);
        }
    }
    
}