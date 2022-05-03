class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) return nums;

        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0) {
                arr[left++] = nums[i];
            }
            else {
                arr[right--] = nums[i];
            }
        }

        return arr;
    }
}