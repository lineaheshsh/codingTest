package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class LastStoneWeight {


    public static int lastStoneWeight(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().toList();
        List<Integer> resultList = recursionFunc(list);
        int r = 0;
        if (resultList.size() > 0) {
            r = resultList.get(0);
        }
        return r;
    }

    private static List<Integer> recursionFunc(List<Integer> stones) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < stones.size(); i++) {
            priorityQueue.add(stones.get(i));
        }

        if (stones.size() <= 1) {
            return stones;
        } else {
            int[] temp = new int[stones.size()];
            int i = 0;
            while (!priorityQueue.isEmpty()) {
                temp[i++] = priorityQueue.poll();
            }

            for (int j = 0; j < temp.length-2; j++) {
                list.add(temp[j]);
            }

            int result;
            System.out.println("temp : " + Arrays.toString(temp));
            if (temp[temp.length-1] > temp[temp.length-2]) {
                result = temp[temp.length-1] - temp[temp.length-2];
                list.add(result);
            }

            return recursionFunc(list);
        }
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
