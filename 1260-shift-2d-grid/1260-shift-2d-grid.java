class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[grid.length * grid[0].length];
        int idx = 0;
        int pos_j = grid[0].length;

        for (int i = 0; i < grid.length; i++) {
            int[] rows = grid[i];
            for (int j = 0; j < rows.length; j++) {
                arr[idx++] = rows[j];
            }
        }

        for (int i = 0; i < k; i++) {
            int lastNum = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = lastNum;
        }

        idx = 0;
        for (int i = 0; i < arr.length; i++) {

            if (idx == pos_j) {
                idx = 0;
                result.add(list);
                list = new ArrayList<>();
            }
            list.add(arr[i]);
            idx++;

            if (i+1 == arr.length) result.add(list);
        }
        
        return result;
    }
}