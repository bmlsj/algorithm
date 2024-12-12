import java.util.*;
class Solution {
    public int solution(int[] array) {
        int[] nums = new int[1001];
        
        // 각 숫자의 빈도를 기록
        for (int num : array) {
            nums[num]++;
        }
        
        int max = -1, ans = 0;
        boolean isExist = true;
        for(int i = 0; i < nums.length;i++) {
            if (max < nums[i]) {
                max = nums[i];  // 최대 빈도
                ans = i;  // 최대 빈도 가진 수
                isExist = true;
            } else if (max == nums[i]) {
                isExist = false;
            }
        }
       
        return isExist ? ans : -1;
    }
}