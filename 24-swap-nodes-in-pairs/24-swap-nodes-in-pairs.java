/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
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
}