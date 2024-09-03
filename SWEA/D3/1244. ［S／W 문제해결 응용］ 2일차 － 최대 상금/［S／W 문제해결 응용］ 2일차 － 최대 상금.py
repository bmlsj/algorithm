import java.util.*;

public class Solution {
    static int result;
    static char[] values;
    static int length;
    static Map<Map.Entry<String, Integer>, Integer> visited;

    public static void main(String[] args) throws Exception {
    	
    	// System.setIn(new FileInputStream("1244_input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        for (int t = 0; t < T; t++) {
            result = -1;
            String[] input = sc.nextLine().split(" ");

            values = input[0].toCharArray();
            int change = Integer.parseInt(input[1]);
            length = values.length;

            visited = new HashMap<>();
            dfs(change);

            System.out.println("#" + (t + 1) + " " + result);
        }

        sc.close();
    }

    static void dfs(int cnt) {
        // 횟수를 다 사용했다면
        if (cnt == 0) {
            int tmp = Integer.parseInt(new String(values));

            // 가지고 있는 최대 수보다 크면 갱신
            if (result < tmp) {
                result = tmp;
            }
            return;
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                // 값 교환
                swap(i, j);

                String tmpKey = new String(values);
                Map.Entry<String, Integer> key = new AbstractMap.SimpleEntry<>(tmpKey, cnt - 1);

                if (visited.getOrDefault(key, 1) == 1) {
                    visited.put(key, 0);
                    dfs(cnt - 1);
                }

                // 값 복구
                swap(i, j);
            }
        }
    }

    static void swap(int i, int j) {
        char temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
}
