package level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class YEAR {
    public static final class Constants {

        public static final int YEAR = 2016;
        public static final String[] DAY_ARR = {
                "MON",
                "TUE",
                "WED",
                "THU",
                "FRI",
                "SAT",
                "SUN"
        };
    }

    public static String solution(int a, int b) {
        LocalDate date = LocalDate.of(Constants.YEAR, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        return Constants.DAY_ARR[dayOfWeekNumber-1];
    }

    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
}
