package level1;

import java.util.Arrays;

public class DivisorArray {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        answer = Arrays.stream(arr).filter(target -> (target%divisor) == 0).sorted().toArray();
        if (answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {5, 9, 7, 10},
                {2, 36, 1, 3},
                {3,2,6}
        };
        int[] divisor = {
                5,
                1,
                10
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println("###################");
            solution(arr[i], divisor[i]);
        }
    }
}
