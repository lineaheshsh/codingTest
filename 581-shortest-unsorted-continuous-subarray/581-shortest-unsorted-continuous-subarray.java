class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] tempArr = Arrays.copyOf(nums, nums.length);
        int[] result = null;
        int left = 0;
        int right = nums.length - 1;
        int leftPos = -1;
        int rightPos = -1;
        Arrays.sort(tempArr);

        for (int i = 0; i < nums.length; i++) {
            if (leftPos == -1 && nums[left] != tempArr[left]) leftPos = left;
            if (rightPos == -1 && nums[right] != tempArr[right]) rightPos = right;

            left++;
            right--;
        }

        if (leftPos > -1 && rightPos > -1) {
            result = Arrays.copyOfRange(nums, leftPos, rightPos+1);
        } else {
            return 0;
        }

        return result.length;
    }
}