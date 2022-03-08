package leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int n = x;
        int reverse=0;
        while(n!=0){
            reverse= reverse * 10 + n % 10;
            n /= 10;
        }

        return x == reverse;
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
