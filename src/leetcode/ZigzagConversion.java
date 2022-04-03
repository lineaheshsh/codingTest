package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {

        if (s.length() < numRows) return s;

        Map<Integer, String> map = new HashMap<>();
        String resultStr = "";
        int position = 0;
        boolean isDirection = true;
        for (int i = 0; i < s.length(); i++) {
            map.put(position, map.getOrDefault(position, "") + s.charAt(i));

            if (position+1 == numRows && position > 0) isDirection = false;
            else if (position == 0 && !isDirection) isDirection = true;

            if (isDirection) position++;
            else position--;
        }

        position = 0;
        for (int i = 0; i < map.size(); i++) {
            resultStr += map.get(position);
            position++;
        }

        return resultStr;
    }

    public static void main(String[] args) {
        String[] sArr = {
                "PAYPALISHIRING",
                "PAYPALISHIRING",
                "AB"
        };

        int[] nArr = {
                3,
                4,
                1
        };

        for (int i = 0; i < sArr.length; i++) {
            System.out.println(convert(sArr[i], nArr[i]));
        }

    }
}
