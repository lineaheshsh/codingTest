package level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrDesc {
    public static String solution(String s) {
//        String answer = "";
//        Character[] cArr = new Character[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            cArr[i] = s.charAt(i);
//        }
//
//        Arrays.sort(cArr, (c1, c2) -> c2 - c1);
//
//        for (int i = 0; i < cArr.length; i++) {
//            answer += cArr[i];
//        }

        /**
         * 스트림 사용한 코드(참고용 ㅜㅜ)
         */
        return Stream.of(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
