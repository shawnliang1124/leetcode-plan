package com.shawnliang.leetcode.plan.array;

/**
 * Description :   二分查找.
 * @url https://leetcode.cn/problems/binary-search/
 * @author : Phoebe

 *
 *
 *
 */
public class Array704 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (right + left ) / 2;

        while(left <= right) {
            if (target == nums[middle]) {
                return middle;
            }
            // 证明在中间的左边，在middle的上一个位置去寻找中间的值
            else if (target < nums[middle]) {
                middle = middle - 1;
                right = middle;
            }
            // 证明在中间的右边，在middle的下一个位置去寻找命中的值
            else {
                middle = middle + 1;
                left = middle;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        Array704 array704 = new Array704();
        int ret = array704.search(new int[]{1, 2, 3, 5, 8}, 8);
        System.out.println(ret);

    }
}
