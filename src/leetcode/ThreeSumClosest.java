package leetcode;

import java.util.*;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int result = threeSumCloset(nums, target);
        return result;
    }

    private static int threeSumCloset(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int j = i+1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == target) {
                    return arr[i] + arr[j] + arr[k];
                } else if (arr[i] + arr[j] + arr[k] < target) {
                    map.put(target - (arr[i] + arr[j] + arr[k]), arr[i] + arr[j] + arr[k]);
                    j++;
                } else {
                    map.put((arr[i] + arr[j] + arr[k]) - target, arr[i] + arr[j] + arr[k]);
                    k--;
                }
            }
        }

        Map.Entry<Integer, Integer> min = Collections.min(map.entrySet(), new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });

        return min.getValue();
    }

    public static void main(String[] args) {
        int[][] numArr = {
                {-1, 2, 1, -4},
                {0, 0, 0},
                {1, 1, 1, 0},
        };

        int[] targetArr = {
                1,
                1,
                -100
        };

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(threeSumClosest(numArr[i], targetArr[i]));
        }
    }
}
