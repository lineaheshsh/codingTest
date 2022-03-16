package leetcode;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {

        if (nums[nums.length-1] < target) return nums.length;

        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                idx = i;
                break;
            } else if (idx == -1 && nums[i] > target) {
                idx = i;
                break;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[][] nums = {
                {1,3,5,6},
                {1,3,5,6},
                {1,3,5,6}
        };

        int[] target = {
                5,
                2,
                7
        };

        for (int i = 0; i < target.length; i++) {
            System.out.println(searchInsert(nums[i], target[i]));
        }
    }
}
