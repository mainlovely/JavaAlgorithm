package com.seven.javaalgorithm.algorithm;

public class LeetCode26 {
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
}
