class MyHashSet {
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

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */