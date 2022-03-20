package leetcode;

import java.math.BigInteger;

public class AddBinary {
    public static String addBinary(String a, String b) {
        BigInteger bigIntegerA = new BigInteger(a, 2);
        BigInteger bigIntegerB = new BigInteger(b, 2);

        return bigIntegerA.add(bigIntegerB).toString(2);
    }

    public static void main(String[] args) {
        String[] a = {
                "11",
                "1010"
        };

        String[] b = {
                "1",
                "1011"
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println(addBinary(a[i], b[i]));
        }
    }
}
