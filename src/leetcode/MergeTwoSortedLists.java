package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode list = null;
        List<Integer> arrayList1;
        List<Integer> arrayList2;

        arrayList1 = listNodeToArrayList(list1);
        arrayList2 = listNodeToArrayList(list2);

        arrayList1.addAll(arrayList2);
        Collections.sort(arrayList1,Collections.reverseOrder());

        System.out.println(arrayList1);
        for (int n : arrayList1) {
            list = new ListNode(n, list);
        }

        return list;
    }

    private static List<Integer> listNodeToArrayList(ListNode listNode) {
        List<Integer> arrayList = new ArrayList<>();

        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }

        return arrayList;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        int[] n1 = {
                -30,-27,-26,-26,-25,-25,-22,-22,-21,-21,-21,-19,-18,-15,-13,-12,-12,-10,-4,-4,1,1,4,8,10,10,12,13,15,15,16,16,16,18,19,21,21,23,23,25,28,28,29,29
        };

        int[] n2 = {
                -30,-30,-29,-29,-28,-26,-25,-25,-23,-22,-21,-19,-19,-17,-16,-14,-14,-13,-13,-11,-9,-8,-8,-7,0,2,2,4,4,6,7,9,9,10,11,11,12,13,13,15,15,21,24,24,25,26,29
        };

        ListNode list1 = null;
        for (int n : n1) {
            list1 = new ListNode(n, list1);
        }

        ListNode list2 = null;
        for (int n : n2) {
            list2 = new ListNode(n, list2);
        }

        mergeTwoLists(list1, list2);
    }
}
