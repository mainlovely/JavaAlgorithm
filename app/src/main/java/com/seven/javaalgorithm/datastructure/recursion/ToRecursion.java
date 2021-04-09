package com.seven.javaalgorithm.datastructure.recursion;

/**
 * 递归(Recursion)
 * 时间复杂度O(n)、空间复杂度O(n)
 *
 * 1、递归代码要警惕堆栈溢出
 * 2、递归代码要警惕重复计算
 *      可以通过一个数据结构（比如散列表）来保存已经求解过的 f(k)。当递归调用到 f(k) 时，先看下是否已经求解过了
 *
 * if (n == 1) return 1;
 * if (n == 2) return 2;
 * return f(n-1) + f(n-2);
 */
public class ToRecursion {
}
