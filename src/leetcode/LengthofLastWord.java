package leetcode;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int len = 0;
        int max = 0;
        if (s.length() == 0) return len;

        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                len++;
            } else {
                len = 0;
            }

            if (len > 0) {
                max = len;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] str = {
                "Hello World",
                "   fly me   to   the moon  ",
                "luffy is still joyboy"
        };
        
        for (String s : str) {
            System.out.println("################ " + s.toString());
            System.out.println(lengthOfLastWord(s));
        }
    }
}
