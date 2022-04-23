package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        combination("", list, 0, 0, n);
        return list;
    }

    public static void combination(String com, List<String> list, int open, int close, int numPair) {
        // reach the limit of combination length
        if (com.length() == numPair * 2) {
            list.add(com);
            return;
        }
        // count number of open parentheses
        if (open < numPair) {
            combination(com+"(", list, open+1, close, numPair);
        }
        // number of open parentheses and close parentheses needs to match
        if (close < open) {
            combination(com+")", list, open, close+1, numPair);
        }
    }

    public static void main(String[] args) {
        int[] nArr = {
                3,
//                1
        };

        for (int n : nArr) {
            System.out.println(generateParenthesis(n));
        }
    }
}
