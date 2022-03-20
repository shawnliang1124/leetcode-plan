package com.shawnliang.leetcode.plan.stack;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Description :  496. 下一个更大元素 I
 * @link https://leetcode-cn.com/problems/next-greater-element-i/
 *
 * @author : Phoebe
 * @date : Created in 2022/3/6
 */
public class NextGreater496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> data = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
           while (!stack.isEmpty() && num > stack.peek()) {
               stack.pop();
           }

           data.put(num, stack.isEmpty() ? -1 : stack.peek());
           stack.push(num);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = data.get(nums1[i]);
        }

        return result;

    }



    public static void main(String[] args) {
        NextGreater496 nextGreater496 = new NextGreater496();
        int nums1[] = new int[] {4,1,2};
        int nums2[] = new int[] {1,3,2,4};

        int[] result = nextGreater496.nextGreaterElement(nums1, nums2);
        System.out.println(result);

    }

}
