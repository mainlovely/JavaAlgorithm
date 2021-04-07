package com.seven.javaalgorithm.datastructure.stack;

import java.util.Stack;

/**
 * 栈(Stack) : 先进后出
 *
 * 1、用数组来实现栈 - 顺序栈
 * 2、用链表来实现栈 - 链表栈
 */
public class ToStack {
    public static void main(String[] args) {

    }
    public Boolean checkLegalStr(String str){
        Stack<String> stack = new Stack<>();
        if(str.length() %2 != 0){
            return false;
        }

        
        return true;
    }
}
