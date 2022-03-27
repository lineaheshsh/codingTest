package leetcode;

import java.util.*;

public class TheKWeakestRowsInAMatrix {

    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int[] arr = mat[i];
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 1) {
                    cnt++;
                }
            }

            map.put(i, cnt);
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[][][] matArr = {
                {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0},{1,1,1,1,1}},
                {{1,0,0,0}, {1,1,1,1}, {1,0,0,0}, {1,0,0,0}}
        };

        int[] k = {
                3,
                2
        };

        for (int i = 0; i < matArr.length; i++) {
            System.out.println("############ " + i + "번째");
            System.out.println(kWeakestRows(matArr[i], k[i]));
        }
    }
}
