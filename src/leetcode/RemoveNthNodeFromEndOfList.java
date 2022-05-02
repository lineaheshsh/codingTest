package leetcode;

import java.util.List;

public class RemoveNthNodeFromEndOfList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int idx = 1;
        ListNode tempNode;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
            idx++;
        }

        return null;
    }

    public static void main(String[] args) {
        int[] n = {
                5,4,3,2,1
        };

        ListNode listNode = null;
        for (int i = 0; i < n.length; i++) {
            listNode = new ListNode(n[i], listNode);
        }

        System.out.println(removeNthFromEnd(listNode, 2));
    }
}
