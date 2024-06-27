import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder ans = new StringBuilder();

        for (char s: a.toCharArray()) {
            if (Character.isLowerCase(s)){
                ans.append(Character.toUpperCase(s));
            }
            else {
                ans.append(Character.toLowerCase(s));
            }
        }

        System.out.println(ans);
    }
}