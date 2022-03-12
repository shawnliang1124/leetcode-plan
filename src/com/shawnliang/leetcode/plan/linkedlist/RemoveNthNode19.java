package com.shawnliang.leetcode.plan.linkedlist;

import java.util.List;

/**
 * Description :   19. 删除链表的倒数节点.
 * @link https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 *
 * @author : Phoebe
 * @date : Created in 2022/3/7
 */
public class RemoveNthNode19 {

    // 暴力解决法
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head == null) {
//            return null;
//        }
//        if (n == 0) {
//            return head;
//        }
//        int length = 0;
//        ListNode node = new ListNode(-1, head);
//        while (head != null) {
//            length++;
//            head = head.next;
//        }
//
//        int index = length - n;
//
//        ListNode newHead = node;
//        // 目的是找到被删除元素的前一个节点
//        for (int i = 0; i < index; i++) {
//           newHead  = newHead.next;
//        }
//
//        newHead.next = newHead.next.next;
//        System.out.println(node.toString());
//        return node.next;
//    }

    /**
     * 双指针解决法
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode fastNode = new ListNode(-1, head);
        ListNode slowNode = new ListNode(-1, head);
        ListNode tmp = slowNode;

        // 快指针先开始循环
        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }

        // 慢指针循环
        while (fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        // 得到要删除的节点
        slowNode.next = slowNode.next.next;
//        System.out.println(tmp.toString());

        return tmp.next;
    }



    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        RemoveNthNode19 removeNthNode19 = new RemoveNthNode19();
        removeNthNode19.removeNthFromEnd(one, 2);

        removeNthNode19.removeNthFromEnd(new ListNode(1), 1);

    }
}
