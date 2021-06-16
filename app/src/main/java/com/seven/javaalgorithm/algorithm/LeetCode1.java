package com.seven.javaalgorithm.algorithm;

import java.util.HashMap;

/**
 * 力扣算法(https://leetcode-cn.com/problemset/all/)
 */
public class LeetCode1 {


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

}
