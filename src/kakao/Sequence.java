package kakao;

public class Sequence {

    public static String sequence(int n, int x, int y) {

        if (x < 0) return null;

        String str = "0";
        String result = "";
        String seq = "";

        for (int i = 0; i < n; i++) {
            if (!"".equals(result)) {
                str = "";
                for (int j = 0; j < result.length(); j++) {
                    int ascii = (int) result.charAt(j);
                    if (ascii == 48) {
                        str += String.valueOf((char) (ascii + 1));
                    } else {
                        str += String.valueOf((char) (ascii - 1));
                    }
                }
            }
            result += str;
        }

        if (y > result.length()) return null;
        else {
            seq = result.substring(x-1, y);
        }

        return seq;
    }

    public static void main(String[] args) {
        int[] n = {
                4,
                5
        };

        int[] x = {
                3,
                1
        };

        int[] y = {
                7,
                16
        };

        for (int i = 0; i < n.length; i++) {
            System.out.println(sequence(n[i], x[i], y[i]));
        }

    }
}
