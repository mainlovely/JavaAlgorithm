package com.seven.javaalgorithm.sort;

/**
 * 冒泡排序（BubbleSort）
 * 时间复杂度： 最好情况O(n) 、最坏情况O(n²) 、 平均O(n²)
 * 每次排序对比，移动量为3个赋值语句
 *
 * 1、有序度(从小到大)：有序元素对：a[i] <= a[j], 如果i < j
 * 2、满有序度：公式: n*(n-1)/2
 * 3、逆序度(从大到小): 有序元素对：a[i] > a[j], 如果i > j
 *      逆序度(需要比较的次数) = 满有序度 - 有序度
 *
 *
 */
public class BubbleSort {
    public static void main(String[] args) {

    }

    public void bubbleSort(int[] nums){
        int size ;
        if((size = nums.length) <= 0){
            return;
        }
        for (int i = 0; i < size; i++) {
            //每一轮遍历的时候有发生数据位移则为true,若false，贼代表不需要再数据位移了，减少不必要的对比轮数
            Boolean flag = false;

            for (int j = 0; j < size; j++) {
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }

            if(!flag){
                break;
            }
        }
    }
}
