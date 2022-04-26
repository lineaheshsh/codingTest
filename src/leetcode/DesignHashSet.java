package leetcode;

public class DesignHashSet {
    public static class MyHashSet {
        int size = (int)Math.pow(10, 6)+1;
        boolean[] keyArr;

        public MyHashSet() {
            keyArr = new boolean[size];
        }

        public void add(int key) {
            keyArr[key] = true;
        }

        public void remove(int key) {
            keyArr[key] = false;
        }

        public boolean contains(int key) {
            return keyArr[key];
        }
    }

    public static void main(String[] args) {
        int size = (int)Math.pow(10, 6)+1;
        System.out.println(size);
    }
}
