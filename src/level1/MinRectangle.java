package level1;

import java.util.Arrays;

public class MinRectangle {

    public static int solution(int[][] sizes) {
        int answer = 0;
        int xMax = 0;
        int yMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            int[] temp = sizes[i];
            xMax = xMax > temp[0] ? xMax : temp[0];
            yMax = yMax > temp[1] ? yMax : temp[1];
        }

        answer = xMax * yMax;
        return answer;
    }

    public static void main(String[] args) {
        int[][][] sizes = {
                {{60, 50}, {30, 70}, {60, 30}, {80, 40}},
                {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}},
                {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}
        };

        for (int i=0; i<sizes.length; i++) {
            System.out.println(solution(sizes[i]));
        }
    }
}
