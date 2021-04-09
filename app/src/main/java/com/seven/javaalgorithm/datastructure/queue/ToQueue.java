package com.seven.javaalgorithm.datastructure.queue;

/**
 * 队列（Queue） - 先进先出
 * 队列有2个指针 : 首指针head、尾指针tail
 * 入队列:enqueue() 、 出队列dequeue()
 *
 * 1、用数组实现队列 - 顺序队列（线性队列、环形队列）
 *      基于数组实现的队列会先确定队列的大小，从而来限制队列入队列和出队列时，无限制的等待响应时间，
 *      环形队列更好能解决队列有空余空间时，对数据需要搬移操作，从O(n)变成O(1)
 *
 * 2、用链表实现队列 - 链式队列
 *      基于链表实现的队列可以支持 无限循环的队列，没有大小限制，但如果有过多任务请求队列时，等待响应时间会很长
 *
 * a)阻塞队列：当入队列没有空间、或者出队列没有数据时，会被阻塞，等有空间或者有数据时才会继续执行
 * b)并发队列：解决多线程操作队列的安全，给enqueue()和dequeue()加锁来控制，
 *
 */
public class ToQueue {

    public static void main(String[] args) {

    }
}
