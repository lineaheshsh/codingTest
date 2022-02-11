package level1;

import java.util.ArrayList;
import java.util.List;

public class Measure {
    /**
     * 시작 번호와 마지막 번호 사이의 숫자들의 약수를 구해
     * 약수가 짝수인 경우 +
     * 약수가 홀수인 경우 -
     * 를 하여 총 합을 return
     * 
     * @param left 시작 번호
     * @param right 마지막 번호
     * @return 시작 번호와 마지막 번호까지의 sum
     */
    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i<=right; i++) {
            List<Integer> measureList = new ArrayList<>();

            // Math.sqrt를 이용해 loop 횟수를 줄인다.
            // sqrt 는 Square root로 제곱근을 뜻한다.
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // 약수 중 작은 수 추가
                    measureList.add(j);
                    
                    // 약수 중 큰 수 추가 
                    if (i / j != j) {
                        measureList.add(i / j);
                    }
                }
            }

            // 2로 나누었을 때 나머지가 0이면 더하기 반대는 빼기
            if (measureList.size() % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] left = {
                13, 24
        };
        int[] right = {
                17, 27
        };
        for (int i = 0; i < left.length; i++) {
            System.out.println(solution(left[i], right[i]));
        }
    }
}
