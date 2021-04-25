package com.seven.javaalgorithm.sort;

/**
 * 选择排序（SelectionSort）
 * 空间复杂度 - O(1)  时间复杂度 - O(n²)
 *
 *
 * 原理:
 * 遍历该数组，每回拿该数组中剩余未排序中 最小的值 放在前面
 *
 */
public class SelectionSort {

    public static int[] selectSort(int[] a, int n){
        if(n <= 1){
            return a;
        }

        for (int i = 0; i < n; i++) {
            int min = a[i];
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if(min > a[j]){
                    min = a[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        return a;
    }

    public static void print(int[] a){
        System.out.println("选择排序输出: ");
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
