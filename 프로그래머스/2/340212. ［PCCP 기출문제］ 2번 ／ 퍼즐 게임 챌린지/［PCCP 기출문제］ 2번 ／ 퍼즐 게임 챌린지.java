import java.util.*;

class Solution {

	static public int solution(int[] diffs, int[] times, long limit) {

    int left = 1;
    int right = 0;

    for (int d : diffs) {
        right = Math.max(right, d);
    }

    int answer = right;

    while (left <= right) {
        int mid = (left + right) / 2;
        long totalTime = 0;

        for (int i = 0; i < diffs.length; i++) {
            int timeCur = times[i];
            int timePrev = (i == 0) ? 0 : times[i - 1];

            if (diffs[i] > mid) {
                int fail = diffs[i] - mid;
                totalTime += (long) (timeCur + timePrev) * fail + timeCur;
            } else {
                totalTime += timeCur;
            }

            if (totalTime > limit) break;
        }

        if (totalTime <= limit) {
            answer = mid;
            right = mid - 1; // 더 낮은 level 가능?
        } else {
            left = mid + 1;  // level 부족
        }
    }

    return answer;
}


}
