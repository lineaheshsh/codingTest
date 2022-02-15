package level1;

public class CenterString {
    /**
     * 가운데 문자 가져오기
     * @param s 문자열
     * @return 가운데 문자
     */
    public static String solution(String s) {
        String answer = "";
        int idx = s.length() / 2;
        if (s.length() % 2 == 0) {
            answer = s.substring(idx-1, idx+1);
        } else {
            answer = s.substring(idx, idx+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] s = {
                "abcde",
                "qwer"
        };
        for (int i = 0; i < s.length; i++) {
            System.out.println(solution(s[i]));
        }

    }
}
