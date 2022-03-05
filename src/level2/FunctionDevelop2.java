package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 날짜를 미리 계산하는 로직 - 참고용
 */
public class FunctionDevelop2 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            System.out.println("peek : " + q.peek() + ", date : " + date);
            if (!q.isEmpty() && q.peek() < date) {
                answerList.add(q.size());
                q.clear();
            }
            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] progresses = {
                {93, 30, 55},
                {95, 90, 99, 99, 80, 99},
                {40, 93, 30, 55, 60, 65},
                {93, 30, 55, 60, 40, 65},
                {99,99,99}
        };

        int[][] speeds = {
                {1, 30, 5},
                {1, 1, 1, 1, 1, 1},
                {60, 1, 30, 5, 10, 7},
                {1, 30, 5 , 10, 60, 7},
                {1,1,1}
        };

        for (int i = 0; i < speeds.length; i++) {
            System.out.println(solution(progresses[i], speeds[i]));
        }
    }
}
