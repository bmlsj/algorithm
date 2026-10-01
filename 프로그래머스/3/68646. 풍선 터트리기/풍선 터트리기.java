class Solution {
    public int solution(int[] a) {
        int n = a.length;
        if (n <= 2) return n; // 풍선이 1개 또는 2개이면 항상 모두 남아있을 수 있음
        
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        
        // 왼쪽에서의 누적 최솟값 구하기
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) min = a[i];
            leftMin[i] = min;
        }
        
        // 오른쪽에서의 누적 최솟값 구하기
        min = a[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < min) min = a[i];
            rightMin[i] = min;
        }
        
        int answer = 0;
        
        // 각 풍선이 끝까지 남을 수 있는지 검사
        for (int i = 0; i < n; i++) {
            // 양쪽 최솟값 모두보다 큰 경우가 아니라면 남길 수 있음
            if (a[i] > leftMin[i] && a[i] > rightMin[i]) continue;
            answer++;
        }
        
        return answer;
    }
}