package level1;

public class EvenOdd {

    public final class Constants {
        public final static String EVEN = "Even";
        public final static String Odd = "Odd";
    }

    public static String solution(int num) {
        return num % 2 == 0 ? Constants.EVEN : Constants.Odd;
    }

    public static void main(String[] args) {
        int[] num = {
                3,
                4
        };

        for (int i = 0; i < num.length; i++) {
            System.out.println(solution(num[i]));
        }
    }
}
