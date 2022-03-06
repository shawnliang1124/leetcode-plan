package com.shawnliang.leetcode.plan.linkedlist;

/**
 * Description :   反转链表.
 *
 * @author : Phoebe
 * @date : Created in 2022/3/5
 */
public class ReverseLinked206 {


    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = prev;

            // prev指针保存反转后的链表
            prev = current;

            // current指针保存反转后半部分的链表
            current = tmp;
        }

        return prev;

    }




}
