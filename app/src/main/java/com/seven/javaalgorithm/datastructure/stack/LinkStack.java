package com.seven.javaalgorithm.datastructure.stack;

public class LinkStack {
    private Node top;

    /**
     * 入栈
     * @param value
     */
    public void push(int value){
        Node newData = new Node(value, null);
        if (top != null) {
            newData.next = top;
        }
        top = newData;
    }

    /**
     * 出栈
     * @return
     */
    public int pop(){
        if(top == null){
            return -1;
        }
        int value = top.data;
        top = top.next; // 需要将原本top下面的那个提上来到top
        return value;
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
