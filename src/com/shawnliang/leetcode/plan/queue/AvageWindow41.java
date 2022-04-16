package com.shawnliang.leetcode.plan.queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Description :   .
 *
 * @author : Phoebe
 * @date : Created in 2022/4/16
 */
public class AvageWindow41 {


    private Queue<Integer> queue ;

    private int size;

    private int windowsTotal = 0;

    public AvageWindow41(int size) {
        queue = new LinkedBlockingQueue<>(size);
        this.size = size;

    }

    public double next(int val) {
        // 如果队列已经满了，之前的数据要出队
        if (!queue.isEmpty() && queue.size() == this.size) {
            while (queue.size() == this.size) {
               windowsTotal = windowsTotal - queue.poll();
            }
        }

        // 这时候队列有位置了，数据入队
        queue.offer(val);
        windowsTotal = windowsTotal + val;

        // 返回平均值
        return (double) windowsTotal / queue.size();
    }

    public static void main(String[] args) {
        AvageWindow41 avageWindow41 = new AvageWindow41(3);
        System.out.println(avageWindow41.next(1));
        System.out.println(avageWindow41.next(2));
        System.out.println(avageWindow41.next(5));
        System.out.println(avageWindow41.next(11));

    }

}
