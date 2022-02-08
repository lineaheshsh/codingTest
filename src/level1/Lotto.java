package level1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lotto {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // lottos 변수 list화
        List<Integer> lottosList = Arrays.stream(lottos)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        // 정답 변수 list화
        List<Integer> winList = Arrays.stream(win_nums)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> distinctList = lottosList.stream()
                .filter(target -> winList.stream().noneMatch(Predicate.isEqual(target)))
                .collect(Collectors.toList());

        int min = lottosList.size() - distinctList.size();
        int max = 0;
        int zeroCnt = 0;
        for (int i = 0; i < distinctList.size(); i++) {
            if (distinctList.get(i) == 0) {
                zeroCnt++;
            }
        }
        max = min + zeroCnt;

        answer[0] = ranking(max);
        answer[1] = ranking(min);
        return answer;
    }

    private static int ranking(int num) {
        int ranking = 0;
        switch (num) {
            case 6:
                ranking = 1;
                break;
            case 5:
                ranking = 2;
                break;
            case 4:
                ranking = 3;
                break;
            case 3:
                ranking = 4;
                break;
            case 2:
                ranking = 5;
                break;
            default:
                ranking = 6;
                break;
        }

        return ranking;
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        solution(lottos, win_nums);

    }
}
