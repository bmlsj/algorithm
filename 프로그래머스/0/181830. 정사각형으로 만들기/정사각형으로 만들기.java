import java.util.*;

class Solution {
    public static int[][] solution(int[][] arr) {
        int max = Math.max(arr[0].length, arr.length);
        int[][] array = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            // array[i]의 0번째부터 arr[0].length 길이 까지 arr[i]를 채워 넣는다.
            // 원본 배열, 복사 시점, 복사할 배열, 복사할 배열의 복사시점, 복사할 요소 수
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
        }

        return array;
    }
}