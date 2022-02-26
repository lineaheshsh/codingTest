package level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NumberDesc {

    public static long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[] sArr = s.split("");
        Arrays.sort(sArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2) - Integer.parseInt(o1);
            }
        });

        answer = Long.parseLong(Arrays.stream(sArr).collect(Collectors.joining()));
        return answer;
    }

    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }
}
