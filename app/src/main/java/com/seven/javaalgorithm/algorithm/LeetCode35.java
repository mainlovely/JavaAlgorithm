package com.seven.javaalgorithm.algorithm;

/**
 * 35、搜索插入位置
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 *
 */
public class LeetCode35 {
    public int searchInsert(int[] nums, int target){
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < target){
                index = i + 1;
            }else{
                index = i;
                break;
            }
        }
        return index;
    }
}
