import java.util.*;
class Solution {
    public static int solution(int a, int b, int c, int d) {
        HashSet<Integer> arrSet = new HashSet<>(Arrays.asList(a, b, c, d));
        List<Integer> arrList = new ArrayList<>(Arrays.asList(a, b, c, d));
        List<Integer> arrSetList = new ArrayList<>(arrSet);

        if (arrSet.size() == 4) {   // 값이 모두 다를 때, 최솟값
            return Collections.min(arrSetList);
        } else if (arrSet.size() == 3) {  // 값이 2개만 같을 때, 다른 값 q * r
            int ans = 1;
            for (Integer num : arrSet) {
                int tmp = num;
                if (Collections.frequency(arrList, tmp) == 1) {
                    ans *= tmp;
                }
            }
            return ans;
        } else if (arrSet.size() == 2) {  // 값이 2개씩 같거나 3개가 같을 때
            int n1 = arrSetList.get(0);
            int n2 = arrSetList.get(1);
            if (Collections.frequency(arrList, n1) == 2 && Collections.frequency(arrList, n2) == 2) {
                return (n1 + n2) * Math.abs(n1 - n2);
            } else {
                if (Collections.frequency(arrList, n1) == 3) return (int) Math.pow(10 * n1 + n2, 2);
                else return (int) Math.pow(10 * n2 + n1, 2);

            }
        } else if (arrSet.size() == 1) {   // 값이 4개 같을 때
            return 1111 * arrList.get(0);
        }
        return -1;
    }
}