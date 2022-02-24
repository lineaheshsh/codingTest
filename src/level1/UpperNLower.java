package level1;

public class UpperNLower {
    public static String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        int idxCnt = 0;

        for (int i = 0; i < sArr.length; i++) {
            if (" ".equals(sArr[i])) {
                answer += " ";
                idxCnt = 0;
            } else {
                if (idxCnt%2 == 0) answer += sArr[i].toUpperCase();
                else answer += sArr[i].toLowerCase();

                idxCnt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        String s = "try hello world";
        String s = "try hello world ";
        System.out.println("[" + solution(s) + "]");
    }
}
