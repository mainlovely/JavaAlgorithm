package com.seven.javaalgorithm.datastructure.queue;

/**
 * 循环队列
 *
 * 解决直线队列前面还有空间数据搬移时O(n) -> O(1)
 */
public class CircularQueue {
    private String[] items;
    private int size;
    private int head;   //首指针
    private int tail;   //尾指针

    public CircularQueue(int mSize){
        items = new String[mSize];
        size = mSize;
        head = 0;
        tail = 0;
    }

    public Boolean enqueue(String item){
        if((tail + 1) % size == head){//队列满了
            return false;
        }

        items[tail] = item;
        tail = (tail + 1) % size;
        return true;
    }

    /**
     * 出队列
     * 时间复杂度:O(1)
     * @return
     */
    public String dequeue(){
        if(head == tail){
            return null;
        }
        String item = items[head];
        head = (head + 1) % size;
        return item;
    }
}
