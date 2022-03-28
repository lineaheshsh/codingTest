package leetcode;

import java.util.stream.IntStream;

public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] nums, int target) {
        boolean isExist = false;
        if (IntStream.of(nums).anyMatch(x -> x == target)) {
            isExist = true;
        }

        return isExist;
    }

    public static void main(String[] args) {
        int[][] numsArr = {
                {2,5,6,0,0,1,2},
                {2,5,6,0,0,1,2}
        };

        int[] targetArr = {
                0,
                3
        };

        for (int i = 0; i < targetArr.length; i++) {
            System.out.println(search(numsArr[i], targetArr[i]));
        }
    }
}
