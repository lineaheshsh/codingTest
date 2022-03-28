package leetcode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultListNode = null;
        ListNode tempListNode = null;
        String temp = "";
        int sum = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum >= 10) {
                temp += (sum - 10);
                sum = 1;
            } else {
                temp += sum;
                sum = 0;
            }

            if (l1 == null && l2 == null) {
                if (sum > 0) {
                    temp += sum;
                }
            }
        }

        System.out.println("temp : " + temp);
        for (int i = temp.length() - 1; i >= 0; i--) {
            resultListNode = new ListNode(Integer.parseInt(String.valueOf(temp.charAt(i))), resultListNode);
        }

        return resultListNode;
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
        ListNode listNode1 = new ListNode(9);
        listNode1 = new ListNode(9, listNode1);
        listNode1 = new ListNode(9, listNode1);
        listNode1 = new ListNode(9, listNode1);
        listNode1 = new ListNode(9, listNode1);
        listNode1 = new ListNode(9, listNode1);
        listNode1 = new ListNode(9, listNode1);

        ListNode listNode2 = new ListNode(9);
        listNode2 = new ListNode(9, listNode2);
        listNode2 = new ListNode(9, listNode2);
        listNode2 = new ListNode(9, listNode2);

        System.out.println(addTwoNumbers(listNode1, listNode2));
    }
}
