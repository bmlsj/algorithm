import java.util.ArrayList;
import java.util.Scanner;

class Solution {

    static int swap(int a, int b) {
        return a;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int q = 0; q < T; q++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> t = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }

            for (int i = 0; i < m; i++) {
                b.add(sc.nextInt());
            }

            if (n > m) {
                m = swap(n, n = m);
                t = a;
                a = b;
                b = t;
            }

            int diff = m - n;
            int res = 0;

            while (diff >= 0) {
                int tmp = 0;
                for (int i = 0; i < n; i++) {
                    tmp += (a.get(i) * b.get(i + diff));
                }
                res = Math.max(tmp, res);
                diff -= 1;
            }


            System.out.printf("#%d %d\n", q + 1, res);
        }


    }
}