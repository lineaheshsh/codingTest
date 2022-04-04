package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SwappingNodesInALinkedList {

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode listNode = null;
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int pos = 0;
        pos = list.size() - k;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (pos == i) {
                listNode = new ListNode(list.get(k - 1), listNode);
            } else if (i == k - 1) {
                listNode = new ListNode(list.get(pos), listNode);
            } else {
                listNode = new ListNode(list.get(i), listNode);
            }
        }

        return listNode;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(91);
        listNode = new ListNode(56, listNode);
        listNode = new ListNode(48, listNode);
        listNode = new ListNode(77, listNode);
        listNode = new ListNode(91, listNode);
        listNode = new ListNode(96, listNode);
        listNode = new ListNode(55, listNode);
        listNode = new ListNode(53, listNode);
        listNode = new ListNode(68, listNode);

        int k = 7;

        System.out.println(swapNodes(listNode, k));
    }
}