package leetcode;

import java.util.*;

public class SmallestStringWithSwaps {
    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        UnionFind uf = new UnionFind(s.length());

        for (int i = 0; i < pairs.size(); i++) {
            int a = pairs.get(i).get(0);
            int b = pairs.get(i).get(1);
            uf.unionAll(a, b);
        }

        Map<Integer, List<Integer>> graphGroup = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int root = uf.find(i);
            graphGroup.putIfAbsent(root, new ArrayList<>());
            graphGroup.get(root).add(i);
        }

        char[] charArr = new char[s.length()];
        for (List<Integer> item : graphGroup.values()) {

            List<Character> charList = new ArrayList<>();
            for (int index : item) {
                charList.add(s.charAt(index));
            }
            Collections.sort(charList);

            for (int idx = 0; idx < item.size(); idx++) {
                charArr[item.get(idx)] = charList.get(idx);
            }
        }
        return new String(charArr);
    }

    public static class UnionFind {
        private int[] parent;
        public UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int n) {
            if (n == parent[n]) {
                return n;
            } else {
                return parent[n] = find(parent[n]);
            }
        }

        public void unionAll(int a, int b) {
            int x = find(a);
            int y = find(b);

            if (x >= y) parent[x] = parent[y];
            else parent[y] = parent[x];
        }

        public void show() {
            System.out.println(Arrays.toString(parent));
        }
    }

    public static void main(String[] args) {
        String[] sArr = {
                "dcab",
                "dcab",
                "abc"
        };

        Integer[][][] nArr = {
            {{0,3},{1,2}},
            {{0,3},{1,2},{0,2}},
            {{0,1},{1,2}}
        };

        for (int i = 0; i < sArr.length; i++) {
            List<List<Integer>> pairs = new ArrayList<>();
            int len = nArr[i].length;
            for (int j = 0; j < len; j++) {
                int subLen = nArr[i][j].length;
                List<Integer> temp = new ArrayList<>();
                for (int k = 0; k < subLen; k++) {
                    temp.add(nArr[i][j][k]);
                }
                pairs.add(temp);
            }
            System.out.println("s : " + sArr[i]);
            System.out.println(smallestStringWithSwaps(sArr[i], pairs));
        }
    }
}
