package com.shawnliang.leetcode.plan.linkedlist;

/**
 * @author shawnLiang
 * https://leetcode.cn/problems/merge-two-sorted-lists/
 *  合并两个环形链表
 *
 */
public class LinkedList27 {
    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1!= null && p2 !=null) {
         if (p1.val < p2.val) {
             p.next = p1;
             p1 = p1.next;
         } else {
             p.next = p2;
             p2 = p2.next;
         }
         p = p.next;
        }

        if (p1.next != null) {
            p.next = p1;
        }
        if (p2.next != null) {
            p.next = p2;
        }

        return dummy.next;
    }
}
