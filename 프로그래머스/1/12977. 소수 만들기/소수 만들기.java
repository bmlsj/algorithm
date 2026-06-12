import java.util.*;
class Solution {

    int answer = 0;

    public int solution(int[] nums) {
        comb(nums, 0, 0, 0);
        return answer;
    }

    void comb(int[] nums, int start, int cnt, int sum) {

        if (cnt == 3) {
            if (isPrime(sum)) {
                answer++;
            }
            return;
        }

        for (int i = start; i < nums.length; i++) {
            comb(nums, i + 1, cnt + 1, sum + nums[i]);
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}