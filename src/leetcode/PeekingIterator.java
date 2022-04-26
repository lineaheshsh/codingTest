package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer> {
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

    public static void main(String[] args) {
//        PeekingIterator peekingIterator = new PeekingIterator([1, 2, 3]); // [1,2,3]
//        peekingIterator.next();    // return 1, the pointer moves to the next element [1,2,3].
//        peekingIterator.peek();    // return 2, the pointer does not move [1,2,3].
//        peekingIterator.next();    // return 2, the pointer moves to the next element [1,2,3]
//        peekingIterator.next();    // return 3, the pointer moves to the next element [1,2,3]
//        peekingIterator.hasNe xt(); // return False
    }
}
