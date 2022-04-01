package leetcode;

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (true) {
            if (left >= right) break;

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[][] sArr = {
                {'h','e','l','l','o'},
                {'H','a','n','n','a','h'}
        };

        for (char[] c : sArr) {
            reverseString(c);
        }
    }
}
