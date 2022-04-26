package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SwapNodesInPairs {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapPairs(ListNode head) {
        // throw all nodes onto stack
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        // if list size if odd, last node will be single
        ListNode tail = stack.size() % 2 == 0 ? null : stack.pop();

        // reverse top two nodes of the stack and attach the previous result
        while (!stack.isEmpty()) {
            ListNode second = stack.pop();
            ListNode first = stack.pop();
            second.next = first;
            first.next = tail;
            tail = second;
        }

        return tail;
    }

    public static void main(String[] args) {
//        1,2,3,4

        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        System.out.println(swapPairs(listNode1));
    }
}
