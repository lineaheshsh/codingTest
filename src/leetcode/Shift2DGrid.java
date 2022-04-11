package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k = k % (total);
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            result.add(list);
            for (int j = 0; j < n; j++) {
                int index = ((i * n + j) - k + total) % total;
                list.add(grid[index / n][index % n]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][][] gridArr = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}
        };

        int[] k = {
                1,
                4
        };

        for (int i = 0; i < gridArr.length; i++) {
            System.out.println("########## : " + Arrays.toString(gridArr[i]));
            System.out.println(shiftGrid(gridArr[i], k[i]));
        }
    }
}
