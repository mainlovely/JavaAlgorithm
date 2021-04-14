package com.seven.javaalgorithm.algorithm;

import java.util.HashMap;

/**
 * 力扣算法(https://leetcode-cn.com/problemset/all/)
 */
public class LeetCode {


    /**
     *  1、两数之和 - 数组(简单)
     *  给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     *
     *  nums = {2,7,11,13}  target = 9
     * @param nums
     * @param target
     * @return
     */
    public int[] twoNums(int[] nums, int target){
        //用HashMap来存储key-数字，value-下标
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    /**
     * 26、删除有序数组中的重复项
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
     *
     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
     * 输出：5, nums = [0,1,2,3,4]
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums){
        if(nums == null){
            return 0;
        }
        if(nums.length <= 1){
            return nums.length;
        }

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[temp] != nums[i]){
                temp++;
                nums[temp] = nums[i];
            }
        }

        return ++temp;
    }

    /**
     * 搜索插入位置
     *
     * 输入: [1,3,5,6], 5
     * 输出: 2
     *
     * 输入: [1,3,5,6], 2
     * 输出: 1
     *
     * @param nums  排序数组
     * @param target  目标值
     * @return
     */
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
