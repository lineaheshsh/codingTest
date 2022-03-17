package leetcode;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            if (sum < 0) sum = 0;
            sum += num;
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] nums = {
                {-2,1,-3,4,-1,2,1,-5,4},
                {1},
                {5,4,-1,7,8}
        };

        for (int[] n : nums) {
            System.out.println("######################## " + n);
            System.out.println(maxSubArray(n));
        }
    }
}
