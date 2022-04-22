package kakao;

public class Sequence {

    public static String sequence(int n, int x, int y) {
        String result = "";
        String seq = "";

        result = makeSeq(n, "0", 1);

        if (y > result.length()) return null;
        else {
            seq = result.substring(x-1, y);
        }

        return seq;
    }

    private static String makeSeq(int n, String str, int cnt) {
        if (cnt == n) return str;
        else {
            String temp = "";
            for (int j = 0; j < str.length(); j++) {
                int ascii = (int) str.charAt(j);
                if (ascii == 48) {
                    temp += String.valueOf((char) (ascii + 1));
                } else {
                    temp += String.valueOf((char) (ascii - 1));
                }
            }
            return makeSeq(n, str + temp, cnt+1);
        }
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
