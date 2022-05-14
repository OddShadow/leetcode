package leetcode._0002_两数相加;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode tail = listNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            ListNode temp = new ListNode();
            if (l1 != null && l2 != null) {
                temp.val = (l1.val + l2.val + carry) % 10;
                carry = (l1.val + l2.val + carry) / 10;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null && l2 != null) {
                temp.val = (l2.val + carry) % 10;
                carry = (l2.val + carry) / 10;
                l2 = l2.next;
            } else if (l2 == null && l1 != null) {
                temp.val = (l1.val + carry) % 10;
                carry = (l1.val + carry) / 10;
                l1 = l1.next;
            }
            tail.next = temp;
            tail = tail.next;
        }
        if (carry == 1) {
            tail.next = new ListNode(carry);
        }
        return listNode.next;
    }
}