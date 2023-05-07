package com.shawnliang.leetcode.plan.linkedlist;

/**
 * @author shawnLiang
 * 分裂链表
 * https://leetcode.cn/problems/partition-list/
 *
 *  help:
 *  使用两个链表（虚拟节点），
 *  链表1：存放比 X 小的节点
 *  链表2： 存放比X 大于等于的节点
 */
public class LinkedList86 {

    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode p1 = dummy1;
        ListNode p2 = dummy2;
        ListNode p = head;

        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p1 = p1.next;
            } else {
                p2.next = p;
                p2 = p2.next;
            }

            // 此时的p节点：还带有原本链表的引用，要去除该p节点的引用
            // 但是p节点要跳到下一个节点
            ListNode tmp = p.next;
            p.next = null;
            p = tmp ;
        }

        // 两条链表已经构建好
        // 其中链表1开始节点是dummy1.next , 最后一个节点是p1
        // 链表2开始节点是dummy2.next, 最后一个节点是p2
        p1.next = dummy2.next;

        return dummy1.next;
    }
}
