package com.shawnliang.leetcode.plan.linkedlist;

/**
 * Description :   141. 环形链表.
 * @link https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * @author : Phoebe
 * @date : Created in 2022/3/6
 */
public class CycleLinked141 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode quick = head.next;

        while (quick.next != null && quick.next.next != null) {
            if (quick != slow) {
                slow = slow.next;
                quick = quick.next.next;
            } else {
                return true;
            }
        }

        return false;
    }

}
