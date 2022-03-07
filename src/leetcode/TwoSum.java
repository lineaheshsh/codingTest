package leetcode;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j <nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] nums = {
//                {2,7,11,15},
//                {3,2,4},
//                {3,3},
                {3,2,4}
        };

        int[] target = {
//                9,
//                6,
//                6,
                6
        };

        for (int i = 0; i < target.length; i++) {
            System.out.println(twoSum(nums[i], target[i]));
        }

    }
}
