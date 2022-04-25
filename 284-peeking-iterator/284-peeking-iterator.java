// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	List<Integer> intList;
    int idx;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        intList = new ArrayList<>();
        while (iterator.hasNext()) {
            intList.add(iterator.next());
        }
        idx = 0;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return intList.get(idx);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int val = intList.get(idx);
        idx++;
        return val;
    }

    @Override
    public boolean hasNext() {
        if (idx < intList.size()) {
            return true;
        } else {
            return false;
        }
    }
}