package com.seven.javaalgorithm.datastructure.complexity;

/**
 * 空间复杂度分析
 * 我们常见的空间复杂度就是 O(1)、O(n)、O(n2 )，像 O(logn)、O(nlogn) 这样的对数阶复杂度平时都用不到
 */
public class SpaceO {
    public static void main(String[] args) {

    }

    /**
     * 就第 3 行申请了一个大小为 n 的 int 类型数组，所以整段代码的空间复杂度就是 O(n)
     * @param n
     */
    void On(int n){
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i*i;
        }
    }
}
