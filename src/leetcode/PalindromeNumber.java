package leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        boolean isSame = false;
        String xStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder(xStr);
        if (xStr.equalsIgnoreCase(sb.reverse().toString())) {
            isSame = true;
        }

        return isSame;
    }

    public static void main(String[] args) {
        int[] x = {
                121,
                -121,
                10
        };

        for (int n : x) {
            System.out.println(isPalindrome(n));
        }
    }
}
