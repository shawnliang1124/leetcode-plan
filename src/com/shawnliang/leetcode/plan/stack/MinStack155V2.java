package com.shawnliang.leetcode.plan.stack;

import java.util.Stack;

/**
 * Description :   .155. 最小栈
 * @link https://leetcode-cn.com/problems/min-stack/
 *
 * 使用同一个栈实现
 * @author : Phoebe
 * @date : Created in 2022/3/20
 */
public class MinStack155V2 {

    public MinStack155V2() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[]{val, val});
        } else {
            // 先处理最小栈
            int[] now = stack.peek();
            if (val < now[1]) {
                stack.push(new int[]{val, val});
            } else {
                stack.push(new int[]{val, now[1]});
            }
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }


    private Stack<int[]> stack;


    public static void main(String[] args) {
        MinStack155V2 stack155V2 = new MinStack155V2();

        stack155V2.push(-2);
        stack155V2.push(0);
        stack155V2.push(-3);

        System.out.println(stack155V2.getMin());
    }
}
