package level1;

public class WaterMelon {
    public static String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] n = {
                3,
                4
        };

        for (int i = 0; i < n.length; i++) {
            System.out.println(solution(n[i]));
        }
    }
}
