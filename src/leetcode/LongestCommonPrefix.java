package leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        String temp = "";
        int idx = 0;
        int endIdx = 1;

        if (strs.length == 1) {
            return strs[0];
        }

        while (true) {
            if (strs[idx].length() > 0 ) {
                if (idx == 0) temp = strs[idx].substring(0, endIdx);

                if (endIdx > strs[idx].length()) {
                    break;
                } else if (!temp.equals(strs[idx].substring(0, endIdx))) {
                    break;
                }

                idx++;

                if (idx == strs.length) {
                    endIdx++;
                    idx = 0;
                    result = temp;

                    if (endIdx > strs[idx].length()) break;
                }
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[][] strs = {
                {"flower", "flow", "flight"},
                {"dog", "racecar", "car"},
                {"a"},
                {""},
                {"",""},
                {"ab", "a"},
                {"flower","flower","flower","flower"}
        };

        for (String[] str : strs) {
            System.out.println("result : [" + longestCommonPrefix(str) + "]");
        }
    }
}
