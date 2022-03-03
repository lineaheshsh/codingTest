package level1;

public class PlusNumeric {
    public static long solution(long n) {
        double result = Math.sqrt(n);
        String temp = String.valueOf(result);
        String strFloat = temp.split("\\.")[1];

        if ( Long.parseLong(strFloat) == 0 ) {
            return (long) Math.pow(result + 1, 2);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] n = {
                121,
                3
        };

        for (int i = 0; i < n.length; i++) {
            System.out.println(solution(n[i]));
        }
    }
}
