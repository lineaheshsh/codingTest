package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseballGame {
    public static int calPoints(String[] ops) {

        List<Integer> list = new ArrayList<>();
        for (String o : ops) {
            switch (o) {
                case "C":
                    list.remove(list.size() - 1);
                    break;
                case "D":
                    int dNum = 0;
                    if (list != null && list.size() > 0) {
                        dNum = list.get(list.size() - 1);
                        list.add(2 * dNum);
                    }
                    break;
                case "+":
                    int firstNum = 0;
                    int secondNum = 0;
                    if (list != null && list.size() > 1) {
                        firstNum = list.get(list.size() - 2);
                        secondNum = list.get(list.size() - 1);
                        list.add(firstNum + secondNum);
                    }
                    break;
                default:
                    list.add(Integer.valueOf(o));
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
