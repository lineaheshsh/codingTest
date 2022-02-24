package level1;

public class StringToInt {
    public static int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        String[] s = {
                "1234", "-1234"
        };

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
