package com.shawnliang.leetcode.plan.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Description : 下一个更大元素 II
 * @link https://leetcode-cn.com/problems/next-greater-element-ii/
 *
 * @author : Phoebe
 * @date : Created in 2022/3/20
 */
public class NextGreater503 {

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();

        // 把数组铺平
        // 思路：栈中存放单调元素的 下标
        // 取栈顶内元素进行比较，栈中存的是 下标，拿下标对应的值，和当前元素进行比较
        // 比当前元素小的，出栈，并且将当前值，填充给出栈的下标
        // 比当前元素大的，当前元素下标入栈
        for (int i = 0; i < 2 * nums.length ; i++) {
            int num =  nums[i % nums.length];

            while (!stack.isEmpty() &&  nums[stack.peek()] < num) {
                res[stack.pop()] = num;
            }

            stack.push(i % nums.length);
        }

        return res;
    }

    public static void main(String[] args) {
        NextGreater503 nextGreater503 = new NextGreater503();

        int[] ints = nextGreater503.nextGreaterElements(new int[]{1,2,3,4,3});
        System.out.println(Arrays.toString(ints));
    }

}
