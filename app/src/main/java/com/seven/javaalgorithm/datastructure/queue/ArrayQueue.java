package com.seven.javaalgorithm.datastructure.queue;

/**
 * 用数组实现队列
 */
public class ArrayQueue {
    private String[] items;
    private int size;
    private int head;   //首指针
    private int tail;   //尾指针

    public ArrayQueue(int mSize){
        items = new String[mSize];
        size = mSize;
        head = 0;
        tail = 0;
    }

    /**
     * 入队列
     * 时间复杂度：
     * 1、如果尾指针未指向最后一个那为O(1)
     * 2、如果tail尾指针指向最后一个，head头指针未指向第一个，那前面还有空间，需要搬移数据则为 O(n)
     * @param item
     * @return
     */
    public Boolean enqueue(String item){
        if(tail == size){//代表尾指针已经指向了队列最后一个
            if(head == 0){//代表头指针从第一个开始就有值，该队列已满
                return false;
            }
            //当尾指针已达到队列底部，head不在第一个，说明队列前面是空的，有数据出过队列，需要将数据往前面搬移
            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }
            tail -= head;
            head = 0;
        }

        items[tail] = item;
        tail++;
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
        return items[head++];
    }

    /**
     * 输出
     */
    public void print(){
        int index = head;
        while (index < tail){
            System.out.print(items[index]);
            index++;
        }
        System.out.println();

    }
}
