package level1;

import java.util.*;

public class NotSameNumber {

    public static List<Integer> solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int n = arr[0];
        queue.add(n);

        for (int i = 1; i < arr.length; i++) {
            if (n != arr[i]) {
                queue.add(arr[i]);
                n = arr[i];
            }
        }

        return new ArrayList(queue);
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1,3,3,0,1,1},
                {4,4,4,3,3}
        };
        for (int i = 0; i < arr.length; i++) {
            solution(arr[i]);
        }
    }
}
