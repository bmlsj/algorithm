class Solution {
        // Method to handle the case where exactly one number is different
    public static int oneDiff(int a, int b, int c, int d) {
        if (a != d && b == c && b == d) {
            return (int) Math.pow(10 * b + a, 2);
        } else if (b != d && a == c && a == d) {
            return (int) Math.pow(10 * a + b, 2);
        } else if (c != d && a == b && a == d) {
            return (int) Math.pow(10 * a + c, 2);
        } else if (d != c && a == b && a == c) {
            return (int) Math.pow(10 * a + d, 2);
        }
        return 0;
    }

    public static int twoDifftwoSame(int a, int b, int c, int d) {
        if ((a == b && c == d)) {
            return (a + c) * Math.abs(a - c);
        } else if ((a == c && b == d) || (b == c && a == d)){
            return (a + b) * Math.abs(a - b);
        }
        return 0;
    }

    // Method to handle the case where there are two equal numbers and two different numbers
    public static int twoDiff(int a, int b, int c, int d) {
        if (a == b && c != d) {
            return c * d;
        } else if (a == c && b != d) {
            return b * d;
        } else if (a == d && b != c) {
            return b * c;
        } else if (b == c && a != d) {
            return a * d;
        } else if (b == d && a != c) {
            return a * c;
        } else if (c == d && a != b) {
            return a * b;
        }
        return 0;
    }

    // Solution method to determine the result based on the given rules
    public static int solution(int a, int b, int c, int d) {
        // 모두 같으면, 1111 * p
        if (a == b && b == c && c == d) {
            return 1111 * a;
        }

        // 모두 다르면, 가장 작은 숫자만큼
        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }

        // Check for other cases
        int result = oneDiff(a, b, c, d);
        if (result != 0) return result;

        result = twoDiff(a, b, c, d);
        if (result != 0) return result;

        result = twoDifftwoSame(a, b, c, d);
        return result;
    }
}