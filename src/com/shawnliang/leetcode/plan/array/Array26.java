package com.shawnliang.leetcode.plan.array;

import java.util.Arrays;

/**
 * @author : shawnliang
 * @date : 2024/3/31 18:12
 */
public class Array26 {

    // 使用双指针去解
    // 快指针去遍历数组
    // 慢指针去记录下标
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                nums[slow + 1] = nums[fast];
                slow++;
            }


        }

        return slow + 1;

    }

    public static void main(String[] args) {
        Array26 array26 = new Array26();
        int[] as = new int[] {1, 1, 2};
        int i = array26.removeDuplicates(as);
        System.out.println(i);
        for (int a : as) {
            System.out.println("数组" + a);
        }
    }
}
