package com.shawnliang.leetcode.plan.linkedlist;

/**
 * Description :   21. 合并两个有序链表.
 * @link  https://leetcode-cn.com/problems/merge-two-sorted-lists/
 *
 * @author : Phoebe
 * @date : Created in 2022/3/7
 */
public class MergeTwoSortList21 {

    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode();

        ListNode listNode = prehead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                listNode.next = list1;
                list1 = list1.next;
            } else {
                listNode.next = list2;
                list2 = list2.next;
            }
            listNode = listNode.next;
        }


        listNode.next = list1 == null ? list2 : list1;

        return prehead.next;

    }
}



