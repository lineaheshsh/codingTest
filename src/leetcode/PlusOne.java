package leetcode;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String digitsStr = "";
        BigInteger digitsPlus;
        BigInteger addOne = new BigInteger("1");
        for (int i = 0; i < digits.length; i++) {
            digitsStr += digits[i];
        }

        digitsPlus = new BigInteger(digitsStr);
        digitsPlus.add(addOne);

        int[] result = Stream.of(digitsPlus.add(addOne).toString().split("")).mapToInt(Integer::parseInt).toArray();

        return result;
    }

    public static void main(String[] args) {
        int[][] digits = {
                {1,2,3},
                {4,3,2,1},
                {9}
        };

        for (int i = 0; i < digits.length; i++) {
            System.out.println("################## " + i);
            System.out.println(plusOne(digits[i]));
        }
    }
}
