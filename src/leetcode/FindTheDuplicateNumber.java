package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Integer findKey = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();

        return findKey.intValue();
    }

    public static void main(String[] args) {
        int[][] numsArr = {
                {1, 3, 4, 2, 2},
                {3, 1, 3, 4, 2}
        };

        for (int[] n : numsArr) {
            System.out.println(findDuplicate(n));
        }
    }
}
