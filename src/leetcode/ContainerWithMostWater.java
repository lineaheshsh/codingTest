package leetcode;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while (left < right) {
            int diff = right - left;
            int shortStick = Math.min(height[left], height[right]);
            result = Math.max(result, diff * shortStick);

            if (shortStick >= height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] heightArr = {
                {1, 8, 6, 2, 5, 4, 8, 3, 7},
                {1, 1},
                {2,3,4,5,18,17,6}
        };

        for (int[] h : heightArr) {
            System.out.println("########### : " + Arrays.toString(h));
            System.out.println(maxArea(h));
        }
    }
}
