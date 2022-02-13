package level1;

import java.util.HashSet;
import java.util.Set;

public class TwoNumSum {

    /**
     * 정수 배열 중 두개의 숫자를 더해 나오는 경우의 수를 모두 return
     * @param numbers -> 정수 배열
     * @return 두개의 숫자를 더해 나온 정수의 배열
     */
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        // 중복 제거를 위한 Set변수
        Set<Integer> sumSet = new HashSet<>();

        // for문 2번을 돌려 다 더해보기
        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                // j와 i가 같지 않을 때만 실행
                if (j!=i) {
                    int sum = numbers[i] + numbers[j];
                    sumSet.add(sum);
                }
            }
        }

        // Set변수를 int array로 변환
        answer = sumSet.stream().mapToInt(Integer::intValue).sorted().toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[][] numbers = {
                {2,1,3,4,1},
                {5,0,2,7}
        };

        for (int i=0; i<numbers.length; i++) {
            solution(numbers[i]);
        }

    }
}
