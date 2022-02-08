package level1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotExistNumberSum {
    public static int solution(int[] numbers) {
        int answer = -1;
        // 정답 번호
        int[] checkNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 인자 List화
        List<Integer> numberList = Arrays.stream(numbers)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        // 정답 번호 List화
        List<Integer> checkNumberList = Arrays.stream(checkNum)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        // stream을 통해 일치 하지 않는 번호들 sum
        int sum = checkNumberList.stream()
                .filter(target -> numberList.stream().noneMatch(Predicate.isEqual(target)))
                .reduce(0, Integer::sum);

        answer = sum;
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }
}
