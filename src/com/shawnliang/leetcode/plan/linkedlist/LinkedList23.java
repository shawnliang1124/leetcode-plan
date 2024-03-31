//package com.shawnliang.leetcode.plan.linkedlist;
//
//import java.util.PriorityQueue;
//
///**
// * 合并 k 个有序链表
// * @author shawnLiang
// * https://leetcode.cn/problems/merge-k-sorted-lists/comments/
// *
// * help:
// *      使用优先级队列，优先级队列排序优先级，元素的值越小，优先出队
// *      首先将list的每个头节点都放进优先队列中，
// *
// *      从优先队列中poll， 拉取最小的元素
// *      循环1： 优先取出最小的头节点，再该头节点的next节点放入优先队列中
// *      循环2： 再从优先队列中选择出：最小的节点
// */
//public class LinkedList23 {
//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists.length == 0) return null;
//        // 虚拟头结点
//        ListNode dummy = new ListNode(-1);
//        ListNode p = dummy;
//        // 优先级队列，最小堆
//        PriorityQueue<ListNode> pq = new PriorityQueue<>(
//                lists.length, (a, b)->(a.val - b.val));
//        // 将 k 个链表的头结点加入最小堆
//        for (ListNode head : lists) {
//            if (head != null)
//                pq.add(head);
//        }
//
//        while (!pq.isEmpty()) {
//            // 获取最小节点，接到结果链表中
//            ListNode node = pq.poll();
//            p.next = node;
//            if (node.next != null) {
//                pq.add(node.next);
//            }
//            // p 指针不断前进
//            p = p.next;
//        }
//        return dummy.next;
//    }
//
//    public static void main(String[] args) {
//        ListNode[] list = new ListNode[3] ;
//
//        int[] ints = {1 ,2, 3};
//       ListNode n1 = new ListNode(ints);
//
//       int[] ints1 = {6,9};
//       ListNode n2 = new ListNode(ints1);
//
//        LinkedList23 linkedList23 = new LinkedList23();
//        ListNode listNode = linkedList23.mergeKLists(new ListNode[]{n1, n2});
//        System.out.println(listNode);
//
//    }
//}
