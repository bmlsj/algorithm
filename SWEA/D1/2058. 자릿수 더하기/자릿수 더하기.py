import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        int ans = 0;

        for (String n: num.split("")){
            ans += Integer.parseInt(n);
        }

        System.out.println(ans);

    }
}