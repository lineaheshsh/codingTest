package level1;

import java.util.regex.Pattern;

public class BasicString {
    public final class Constants {
        public final static String NUMBER_PATTERN = "^[0-9]*$";
    }
    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            answer = Pattern.matches(Constants.NUMBER_PATTERN, s);
            return answer;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] s = {
                "a234",
                "1234"
        };

        for (int i = 0; i < s.length; i++) {
            System.out.println(solution(s[i]));
        }
    }
}
