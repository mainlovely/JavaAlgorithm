package com.seven.javaalgorithm.datastructure.stack;

/**
 * 用数组来实现栈（顺序栈）
 * 时间复杂度：
 * 1、当不可变数组 - O(1)
 * 2、当可变数组：
 *      a)未满栈大小 - O(1)
 *      b)满栈大小需要扩容、复制数据 - 最大时间度O(n)
 *      平均复杂度O(1)
 */
public class ArrayStack {
    private String[] items;
    private int size;           //栈的大小
    private int count;          //栈的元素个数

    public ArrayStack(int size){
        items = new String[size];
        this.size = size;
        count = 0;
    }

    /**
     * 入栈
     * @param item
     * @return
     */
    public Boolean push(String item){
        if(size == count){
            return false;
        }
        items[count] = item;
        ++count;
        return true;
    }

    /**
     * 出栈
     * @return
     */
    public String pop(){
        if(count == 0){
            return null;
        }
        --count;
        return items[count];

    }
}
