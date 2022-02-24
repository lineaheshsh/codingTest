package level1;

import java.util.ArrayList;
import java.util.List;

public class ReverseNaturalNumber {
    public static List<Integer> solution(long n) {
        List<Integer> reverseArr = new ArrayList<>();
        while (true) {
            reverseArr.add((int) (n%10));

            if (n<10) break;

            n = n/10;
        }

        return reverseArr;
    }

    public static void main(String[] args) {
        long n = 12345;

        System.out.println(solution(n));
    }
}
