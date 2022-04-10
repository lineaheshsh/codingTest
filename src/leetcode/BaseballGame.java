package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseballGame {
    public final class Constant {
        public static final String CANCLE = "C";
        public static final String DOUBLE = "D";
        public static final String SUM = "+";

        public static final String NUM_PATTERN = "^(-[0-9]|[0-9])*$";
        private Constant() {};
    }

    public static int calPoints(String[] ops) {

        List<Integer> list = new ArrayList<>();
        for (String o : ops) {
            switch (o) {
                case Constant.CANCLE:
                    list.remove(list.size() - 1);
                    break;
                case Constant.DOUBLE:
                    int dNum = 0;
                    if (list != null && list.size() > 0) {
                        dNum = list.get(list.size() - 1);
                        list.add(2 * dNum);
                    }
                    break;
                case Constant.SUM:
                    int firstNum = 0;
                    int secondNum = 0;
                    if (list != null && list.size() > 1) {
                        firstNum = list.get(list.size() - 2);
                        secondNum = list.get(list.size() - 1);
                        list.add(firstNum + secondNum);
                    }
                    break;
                default:
                    if (o.matches(Constant.NUM_PATTERN)) {
                        list.add(Integer.valueOf(o));
                    } else {
                        System.out.println("Not Num pattern.");
                    }
                    break;
            }
        }

        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        String[][] optsArr = {
                {"5", "2", "C", "D", "+"},
                {"5", "-2", "4", "C", "D", "9", "+", "+"}
        };

        for (String[] o : optsArr) {
            System.out.println("##################### : " + Arrays.toString(o));
            System.out.println(calPoints(o));
        }
    }

}
