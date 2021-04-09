package com.seven.javaalgorithm.datastructure.queue;

import java.util.LinkedList;

/**
 * 链表队列
 */
public class LinkQueue {
    private Node head;  //队列的头指针
    private Node tail;  //队列的尾指针

    public LinkQueue(){

    }

    /**
     * 入队列
     * @param value
     */
    public void enqueue(int value){
        Node newData = new Node(value, null);
        if(tail == null){
            tail = newData;
            head = newData;
        }else{
            tail.next = newData;
            tail = newData;
        }

    }

    /**
     * 出队列
     * @return
     */
    public int dequeue(){
        if(head == null){
            return -1;
        }
        int value = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return value;
    }


    public void print(){
        Node cur = head;
        while (cur != null){
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }


    private class Node{
        private int data;
        private Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public int getData(){
            return data;
        }
    }
}
