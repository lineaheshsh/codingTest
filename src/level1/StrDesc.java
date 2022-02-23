package level1;

import java.util.Arrays;

public class StrDesc {
    public static String solution(String s) {
        String answer = "";
        Character[] cArr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            cArr[i] = s.charAt(i);
        }

        Arrays.sort(cArr, (c1, c2) -> c2 - c1);

        for (int i = 0; i < cArr.length; i++) {
            answer += cArr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
