//package com.seven.javaalgorithm.algorithm
//
//class Algorithm {
//
//    /**
//     * 数组 - 用哈希表两数之和
//     * nums = {2,7,11,13}  target = 9
//     */
//    fun twoNums(nums: IntArray, target: Int): IntArray{
//        val map = HashMap<Int, Int>()
//        nums.forEachIndexed { index, i ->
//            if(map.containsKey(target - i)){
//                return intArrayOf(map[target - i]?:0, index)
//            }else{
//                map[i] = index
//            }
//        }
//        return intArrayOf()
//    }
//
//    /**
//     * 删除有序数组中得重复项
//     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
//     * 输出：5, nums = [0,1,2,3,4]
//     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
//     */
//    fun removeDuplicates(nums: IntArray): Int {
//        val size = nums.size
//        if(size <= 1){
//            return size
//        }
//        var cur = 0
//        nums.forEachIndexed { index, i ->
//            if(nums[cur] != i){
//                cur ++
//                nums[cur] = i
//            }
//        }
//        return ++cur
//    }
//}