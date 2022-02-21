package level1;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dart {

    public enum Score {
        S(1),
        D(2),
        T(3);

        private final int num;
        Score(int num) { this.num = num; }
        public int getNum() { return num; }
    }

    public static int solution(String dartResult) {
        int answer = 0;
        Pattern p = Pattern.compile("([0-9]+[A-Z]{1})|(\\*|\\#)");
        Matcher m = p.matcher(dartResult);
        List<Integer> list = new LinkedList<>();

        while (m.find()) {
            String str = m.group();
            if (str.length() > 1) {
                list.add((int) Math.pow(Integer.valueOf(str.substring(0, str.length() - 1)),Score.valueOf(str.substring(str.length() - 1)).getNum()));
//                System.out.println((int) Math.pow(Integer.valueOf(str.substring(0, str.length() - 1)),Score.valueOf(str.substring(str.length() - 1)).getNum()));
            } else {
                if ("*".equals(str)) {
//                    System.out.println("*");
                    int loopCnt = 0;
                    for (int i = (list.size()-1); i >= 0; i--) {
                        if (loopCnt == 2) break;

                        list.set(i, list.get(i) * 2);
                        loopCnt++;
                    }
                } else {
//                    System.out.println("#");
                    for (int i = (list.size()-1); i >= list.size()-1; i--) {
                        list.set(i, list.get(i) * -1);
                    }
                }
            }
        }

        return list.stream().mapToInt(i -> i).sum();
    }

    public static void main(String[] args) {
        String[] dartResult = {
                "1S2D*3T", // 37
                "1D2S#10S", // 9
                "1D2S0T", // 3
                "1S*2T*3S", // 23
                "1D#2S*3S", // 5
                "1T2D3D#", // -4
                "1D2S3T*" // 59
        };

        for (int i = 0; i < dartResult.length; i++) {
            System.out.println("####################");
            System.out.println(solution(dartResult[i]));
        }
    }
}
