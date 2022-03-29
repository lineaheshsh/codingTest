package leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;

        String subString = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("".equals(subString)) {
                subString += s.charAt(i);
            } else {
                int idx = subString.indexOf(String.valueOf(s.charAt(i)));
                if (idx > -1) {
                    max = max > subString.length() ? max : subString.length();
                    subString = subString.substring(idx+1) + s.charAt(i);
                } else {
                    subString += s.charAt(i);
                }
            }

            if ((i + 1) == s.length()) {
                max = max > subString.length() ? max : subString.length();
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String[] sArr = {
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "aab",
                "dvdf",
                "anviaj"
        };

        for (String s : sArr) {
            System.out.println("############ : " + s);
            System.out.println(lengthOfLongestSubstring(s));
        }
    }
}
