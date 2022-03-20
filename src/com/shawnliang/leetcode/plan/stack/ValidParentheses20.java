package com.shawnliang.leetcode.plan.stack;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Description :   20. 有效的括号.
 * @link https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author : Phoebe
 * @date : Created in 2022/3/6
 */
public class ValidParentheses20 {

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        Map<String, String> data = new HashMap<>();
        data.put(")", "(");
        data.put("]", "[");
        data.put("}", "{");
        List<String> keys = new ArrayList<>(data.values());

        Stack<String> stack = new Stack<>();
        for (char symbol : s.toCharArray()) {
            String symbolStr = String.valueOf(symbol);

            if (keys.contains(symbolStr)) {
                stack.push(symbolStr);
            } else {
                // 如果栈是空，证明已经没有比较的意义了，直接返回false；
                if (stack.isEmpty()) {
                    return false;
                }

                String leftSymbol = stack.peek();
                String leftValue = data.get(symbolStr);
                if (!leftSymbol.equals(leftValue)) {
                    return false;
                }

                // 元素相等，出栈
                stack.pop();
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        ValidParentheses20 validParentheses20 = new ValidParentheses20();
        String testStr = "]";

        System.out.println(validParentheses20.isValid(testStr));
    }

}
