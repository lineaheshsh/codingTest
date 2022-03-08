package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {

    public enum RomanEnum {

        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        RomanEnum(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

    }

    public static int romanToInt(String s) {
        StringBuilder sb = new StringBuilder(s);

        return analyzerRoman(sb.reverse().toString());
    }

    private static int analyzerRoman(String s) {
        int i = 0;
        int temp = 0;
        int result = 0;
        char[] cArr = s.toCharArray();
        while (i < cArr.length) {
            char c1 = s.charAt(i);
            int value1 = RomanEnum.valueOf(String.valueOf(c1)).value;

            if (temp > value1) result -= value1;
            else result += value1;

            temp = value1;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {

        String[] s = {
                "III",      // 3
                "LVIII",    // 58
                "MCMXCIV"   // 1994
        };

        for (String p : s) {
            System.out.println(romanToInt(p));
        }
    }
}
