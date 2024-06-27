class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(""+ a+ b);
        int num2 = Integer.parseInt("" + (2*a*b));
        return (num1 == num2) ? num1 : Math.max(num1, num2);
    }
}