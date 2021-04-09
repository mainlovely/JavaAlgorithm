package com.seven.javaalgorithm;

import com.seven.javaalgorithm.datastructure.queue.ArrayQueue;
import com.seven.javaalgorithm.datastructure.queue.LinkQueue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);

    }

    /**
     * 数组线性队列
     */
    private void arrayQueueTest(){
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.enqueue("aa");
        arrayQueue.enqueue("bb");
        arrayQueue.enqueue("cc");
        arrayQueue.enqueue("dd");
        arrayQueue.print();
        arrayQueue.dequeue();
        arrayQueue.print();
    }

    private void circularQueueTest(){
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.enqueue("aa");
        arrayQueue.enqueue("bb");
        arrayQueue.enqueue("cc");
        arrayQueue.print();
        arrayQueue.dequeue();
        arrayQueue.enqueue("dd");
        arrayQueue.print();
    }

    /**
     * 链表队列
     */
    private void linkQueueTest(){
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.enqueue(1);
        linkQueue.enqueue(2);
        linkQueue.enqueue(3);
        linkQueue.enqueue(4);
        linkQueue.print();
        linkQueue.dequeue();
        linkQueue.print();
    }
}