import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Solution
{
	public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        nums.sort(Comparator.naturalOrder());
        System.out.println(nums.get(n / 2));

    }
}