package level1;

import java.util.Arrays;

public class Ponketmon {

    public static int solution(int[] nums) {
        int answer = 0;
        // 중복제거
        int distinct = (int) Arrays.stream(nums).distinct().count();
        // 최대 고를 수 있는 갯수
        int max = nums.length / 2;
        // 중복제거한 갯수가 max보다 크면 max로 return
        answer = distinct > max ? max : distinct;

        return answer;
    }

    public static void main(String[] args) {
        int[][] testCase = {
                {3,1,2,3},
                {3,3,3,2,2,4},
                {3,3,3,2,2,2}
        };
        for (int i=0; i<testCase.length; i++) {
            System.out.println(solution(testCase[i]));
        }
    }
}
