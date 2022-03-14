package leetcode;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int position = 0;
        int len = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                for (int j = len; j > i; j--) {
                    if (nums[i] != nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                        len = j;
                        break;
                    }
                }
            }
        }


        for (int n : nums) {
            if (n != val) position++;
        }

        return position;
    }

    public static void main(String[] args) {

        int[][] nums = {
                {3,2,2,3},
                {0,1,2,2,3,0,4,2},
                {0,4,4,0,4,4,4,0,2}
        };

        int[] val = {
                3,
                2,
                4
        };

        for (int i = 0; i < nums.length; i++) {
            System.out.println("############ START");
            System.out.println(removeElement(nums[i], val[i]));
            System.out.println("############ END");
        }
    }
}
