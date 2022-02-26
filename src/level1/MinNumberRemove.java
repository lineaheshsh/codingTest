package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinNumberRemove {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int min = 0;

        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                min = list.get(i);
            }

            if (min > list.get(i)) min = list.get(i);
        }
        list.remove((Integer) min);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[][] arr = {
                {4,3,2,1},
                {10}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(solution(arr[i]));
        }
    }
}
