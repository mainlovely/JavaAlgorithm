package com.seven.javaalgorithm.sort;

/**
 * 插入排序（InsertionSort）
 * 空间复杂度:O(1)
 * 时间复杂度:
 *      已排序数组中时间复杂度O(n) - 最好情况
 *      未排序数组中复杂度为O(n²) - 最坏情况
 *
 * 插入排序也包含两种操作，一种是元素的比较，一种是元素的移动
 *
 *  每次排序对比，移动量为1个赋值语句
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] num = insertionSort(new int[]{2,1,6,5,3,4}, 6);
        System.out.println("a = " + num);
    }

    // 插入排序，a表示数组，n表示数组大小
    public static int[] insertionSort(int[] a, int n) {
        if (n <= 1) return a;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j+1] = value; // 插入数据
        }
        return a;
    }

    public static void print(int[] a){
        System.out.println("插入排序输出: ");
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
