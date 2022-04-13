package leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static final class Constants {
        public static final Map<String, String> map = Map.of("2", "abc",
                                                                    "3", "def",
                                                                    "4", "ghi",
                                                                    "5", "jkl",
                                                                    "6", "mno",
                                                                    "7", "pqrs",
                                                                    "8", "tuv",
                                                                    "9", "wxyz");

        private Constants() {}
    }

    /**
     * DFS
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        char[] dig = digits.toCharArray();
        String curStr = Constants.map.get(String.valueOf(dig[0]));
        for (Character c: curStr.toCharArray()){
            letterCombinations(dig, 1, String.valueOf(c), result);
        }
        return result;
    }

    private static void letterCombinations(char[] dig, Integer pos, String previous, List<String> result) {
        if (pos == dig.length) {
            result.add(previous);
            return;
        }
        String curStr = Constants.map.get(String.valueOf(dig[pos]));
        for (Character c: curStr.toCharArray()){
            letterCombinations(dig, pos + 1, previous + c, result);
        }
        return;
    }

    public static void main(String[] args) {
        String[] digitsArr = {
                "23",
                "",
                "2",
                "2345"
        };

        for (String d : digitsArr) {
            System.out.println("############ : " + d);
            System.out.println(letterCombinations(d));
        }
    }
}
