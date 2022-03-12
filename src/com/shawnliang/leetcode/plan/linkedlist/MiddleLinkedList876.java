package com.shawnliang.leetcode.plan.linkedlist;

/**
 * Description :   876. 链表的中间结点
 * @link  https://leetcode-cn.com/problems/middle-of-the-linked-list/
 *
 * @author : Phoebe
 * @date : Created in 2022/3/12
 */
public class MiddleLinkedList876 {

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
