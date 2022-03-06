package level2;

import java.util.PriorityQueue;

public class Spicy {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        int cnt = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.offer(scoville[i]);
        }
        while (priorityQueue.peek() < K) {
            if (priorityQueue.size() < 2) return -1;
            int first = priorityQueue.poll();
            int second = priorityQueue.poll() * 2;
            int sum = first + second;

            priorityQueue.add(sum);
            cnt++;
        }
        answer = cnt;
        return answer;
    }

    public static void main(String[] args) {
        int[][] scoville = {
                {1, 2, 3, 9, 10, 12},
                {1,2},
                {1, 1, 1},
                {10, 10, 10, 10, 10}
        };

        int[] k = {
                7,  //2
                7,  //-1
                4,   //2
                100, //4
        };

        for (int i = 0; i < k.length; i++) {
            System.out.println(solution(scoville[i], k[i]));
        }
    }
}
