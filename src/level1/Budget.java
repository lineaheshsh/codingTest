package level1;

import java.util.Arrays;

public class Budget {

    /**
     *
     * @param d -> 부서별 신청한 금액
     * @param budget -> 예산
     * @return -> 최대 지원해 줄 수 있는 부서 수
     */
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int max = 0;
        // 부서별 신청한 금액 오름차순 정렬
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            // 총 예산이 신청한 예산보다 큰 경우에만 다음 예산 더하는 로직 실행
            if ( d[i] <= budget ) {
                int sum = d[i];
                int cnt = 1;
                for (int j = i + 1; j < d.length; j++) {
                    sum += d[j];
                    if (sum > budget) {
                        break;
                    }
                    cnt++;
                }
                max = max > cnt ? max : cnt;
            } else {
                continue;
            }
        }
        answer = max;
        return answer;
    }

    public static void main(String[] args) {
        int[][] d = {
                {1,3,2,5,4},
                {2,2,3,3}
        };
        int[] budget = {
                9, 10
        };
        for (int i=0; i<d.length; i++) {
            System.out.println(solution(d[i], budget[i]));
        }
    }
}
