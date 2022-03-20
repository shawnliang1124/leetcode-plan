package com.shawnliang.leetcode.plan.stack;

import java.util.Stack;

/**
 * Description :   .155. 最小栈
 * @link https://leetcode-cn.com/problems/min-stack/
 *
 * 使用辅助栈的方式去实现
 * @author : Phoebe
 * @date : Created in 2022/3/20
 */
public class MinStack155V1 {

    public MinStack155V1() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            Integer first = minStack.peek();
            if (val < first) {
                minStack.push(val);
            } else {
                minStack.push(first);
            }
        }

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
      return  minStack.peek();
    }

    // 使用两个栈记录，栈元素和栈的最小值
    private Stack<Integer> stack;

    private Stack<Integer> minStack;

}
