package com.seven.javaalgorithm.datastructure.array;

import java.util.ArrayList;

/**
 * 数组(Array):一种线性表数据结构，用连续内存空间存储一组相同类型的数据
 * 特点: 1、是连续内存地址
 *      2、指定数组长度，且类型
 *      3、方便查询为O(1),,插入和删除繁琐，需要移动后面的数据，复杂度为O(n)
 *
 * 线性集合(ArrayList)：内部已封装好插入、和删除方法的数组，且长度是可变
 * 特点：1、当插入、删除数据时，内部封装将后面数据移动
 *      2、当插入数据超过原有特定的长度时，会自动创建大小为原1.5倍空间的新地址数组，将原数据复制到新的数组中;
 */
public class ToArray {
    public static void main(String[] args) {
        int[] num = new int[10];
        // 删除、插入 - 复杂度为O(n) 、查询复杂度为O(1)
        num[0] = 1;

        ArrayList list = new ArrayList<String>();
        list.add("aa");

    }

    public int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        if(nums.length <= 1){
            return nums.length;
        }

        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[cur] != nums[i]){
                cur++;
                nums[cur] = nums[i];
            }
        }
        return ++cur;
    }
}
