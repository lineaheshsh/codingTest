package leetcode;

import java.util.*;

public class LastStoneWeight {


    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            priorityQueue.add(stones[i]);
        }

        while (priorityQueue.size() > 1) {
            System.out.println(priorityQueue.toString());
            int y = priorityQueue.poll();
            int x = priorityQueue.poll();
            if (y > x) {
                priorityQueue.add(y - x);
            }
        }

        int r = priorityQueue.size() == 0 ? 0 : priorityQueue.poll();

        return r;
    }

    public static void main(String[] args) {
        int[][] stoneArr = {
                {2,7,4,1,8,1},
                {1},
                {2,2}
        };

        for (int[] s : stoneArr) {
            System.out.println("########## : " + Arrays.toString(s));
            System.out.println(lastStoneWeight(s));
        }
    }
}
