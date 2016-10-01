package algorithm.linkedList;

/**
 * 2. Add Two Numbers
 *
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain
 * a single digit. Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * https://leetcode.com/problems/add-two-numbers/
 *
 * @author Allen on 2016/10/1.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null && l2 != null) {
            cur.next = new ListNode((l1.val + l2.val + carry) % 10);
            carry = ((l1.val + l2.val + carry) / 10);
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            if(carry != 0) {
                cur.next = new ListNode((l1.val + carry) % 10);
                carry = (l1.val + carry) / 10;
            } else {
                cur.next = l1;
            }
            cur = cur.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            if(carry != 0) {
                cur.next = new ListNode((l2.val + carry) % 10);
                carry = (l2.val + carry) / 10;
            } else {
                cur.next = l2;
            }
            cur = cur.next;
            l2 = l2.next;
        }

        if(carry != 0) {
            cur.next = new ListNode(carry);
        }
        return dummy.next;
    }

}
