package level2;

import java.util.*;

public class FunctionDevelop {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j < progresses.length; j++) {
                if (progresses[j] == -1) {
                    continue;
                }

                progresses[j] = progresses[j] + speeds[j];

                if (progresses[j] >= 100) {
                    map.put(j, i);
                    progresses[j] = -1;
                }
            }
        }
//        System.out.println(map.toString());

        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < map.size(); i++) {
            for (int j = i+1; j < map.size(); j++) {
//                System.out.println("for i = " + i + ", j = " + j);
                if (map.get(i) >= map.get(j)) {
                    cnt++;
                } else {
                    queue.add(cnt);
                    cnt = 1;
                    i = j;
//                    System.out.println("for j = i " + i);
                }

                if (j == map.size()-1) i = j;
            }

            if (i==map.size()-1 && queue.stream().mapToInt(Integer::intValue).sum() < map.size()) queue.add(cnt);
        }
        System.out.println(queue.toString());

        return queue.stream().mapToInt(Integer::intValue).toArray();
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
