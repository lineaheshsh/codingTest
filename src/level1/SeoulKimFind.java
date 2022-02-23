package level1;

import java.util.Arrays;
import java.util.List;

public class SeoulKimFind {
    public final class Constants {
        public final static String KIM = "Kim";
        public final static String MESSAGE = "김서방은 %d에 있다";
    }

    public static String solution(String[] seoul) {
        String answer = "";
        List<String> list = Arrays.asList(seoul);
        answer = String.format(Constants.MESSAGE, list.indexOf(Constants.KIM));
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {
                "Jane", "Kim"
        };

        System.out.println(solution(seoul));
    }
}
