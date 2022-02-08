package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KNum {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i<commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int sel_num = commands[i][2];

            List<Integer> tmepList = new ArrayList<>();
            for (int j=(start-1); j<end; j++) {
                tmepList.add(array[j]);
            }
            Collections.sort(tmepList);
            answer[i] = tmepList.get(sel_num-1);
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };
        solution(arr, commands);
    }
}
