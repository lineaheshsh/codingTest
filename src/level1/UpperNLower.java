package level1;

public class UpperNLower {
    public static String solution(String s) {
        String answer = "";
        char[] sArr = s.toCharArray();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int ascii = 0;
            if (i%2 == 0) {
                ascii = (int)sArr[i] - 32;
            } else {
                ascii = (int)sArr[i];
                if (ascii >= 97 && ascii <= 122) {

                } else {
                    ascii += 32;
                }
            }
            answer += (char)ascii;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
