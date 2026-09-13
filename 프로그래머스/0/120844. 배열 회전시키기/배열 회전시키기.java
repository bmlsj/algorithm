class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int idx = 0;
        
        if (direction.equals("right")){
            for(int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[(i + numbers.length - 1) % numbers.length];
                // System.out.println(answer[i]);
            }
            
        } else {
            for(int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[(i + 1) % numbers.length];
                // System.out.println(answer[i]);
            }
        }
        
        return answer;
    }
}