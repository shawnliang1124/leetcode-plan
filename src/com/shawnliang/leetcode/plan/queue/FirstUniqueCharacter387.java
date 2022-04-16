package com.shawnliang.leetcode.plan.queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Description :   .387. 字符串中的第一个唯一字符
 *
 * @author : Phoebe
 * @date : Created in 2022/4/13
 * @url  https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacter387 {

    /**
     * 使用Hash结构进行处理
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
       Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char data = chars[i];
            if (map.containsKey(data)) {
                map.put(data, -1);
            } else {
                // 将内容和下标存到Map
                map.put(data, i);
            }
        }

        int n = chars.length;
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != -1 && entry.getValue() < n) {
                n = entry.getValue();
            }
        }

       return n == chars.length ? -1 : n;

    }

    public static void main(String[] args) {
        FirstUniqueCharacter387 firstUniqueCharacter387 = new FirstUniqueCharacter387();
        int hello = firstUniqueCharacter387.firstUniqChar("hhelloe");
        System.out.println(hello);
    }

}
