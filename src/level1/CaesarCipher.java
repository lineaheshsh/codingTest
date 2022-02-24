package level1;

public class CaesarCipher {
    public static String solution(String s, int n) {
        String answer = "";
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            int ascii = (int) sArr[i];
            int plusAscii = ascii + n;

            if (ascii == 32) {
                answer += sArr[i];
            } else if (ascii >= 97 && ascii <= 122) {
                if (plusAscii > 122) {
                    plusAscii = plusAscii - 26;
                }

                answer += (char)plusAscii;
            } else if (ascii >= 65 && ascii <= 90) {
                if (plusAscii > 90) {
                    plusAscii = plusAscii - 26;
                }

                answer += (char)plusAscii;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        String[] s  = {
            "AB",
                    "y",
                    "a B z"
        };

        int[] n = {
                1,
                3,
                4
        };

        for (int i = 0; i < s.length; i++) {
            System.out.println(solution(s[i], n[i]));
        }
    }
}
