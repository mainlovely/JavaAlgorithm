package com.seven.javaalgorithm.datastructure.complexity;

/**
 * 时间复杂度O：
 * T(n) = O(f(n))
 * 1、只关注循环执行次数最多的一行
 * 2、加法口则
 * 3、乘法法则：嵌套代码的复杂度等于嵌套内外代码复杂度的乘积
 *
 * 一、多项式量级
 * 常量阶:O(1)
 * 对数阶:O(logn)
 * 线性阶:O(n)
 * 线性对数阶:O(nlogn)
 * 平方阶:O(n²)
 * 立方阶:O(n³)
 *
 * O(1) < O(logn) < O(n) < O(nlogn) < O(logn²) < O(logn³)
 *
 * 二、非多项式量级NP(当数据规模 n 越来越大时，非多项式量级算法的执行时间会急剧增加)
 * 指数阶:O(2*2*...n..*2)
 * 阶乘阶:O(n!)
 *
 *
 *
 *
 */
public class TimeO {
    public static void main(String[] args) {


    }

    /**
     * O(1)
     * 代码的执行时间不随 n 的增大而增长，这样代码的时间复杂度我们都记作 O(1)
     */
    void O1(){
        int i = 1;
        int j = 2;
        int sum = i + j;
        System.out.print("O(1) : sum = "+ sum);
    }

    /**
     * O(logn)
     * @param n
     */
    int Ologn(int n){
        int i = 1;
        while (i < n){
            i = i * 2;
        }
        System.out.print("O(logn) : i = " + i);
        return i;
    }

    /**
     * O(nlogn)
     * @param n
     */
    void Onlogn(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Ologn(n);
        }
        System.out.print("O(nlogn) : sum = " + sum);
    }

    /**
     * 无法事先评估 m 和 n 谁的量级大
     * 按加法规则：T1(m) + T2(n) = O(f(m)) + O(f(n))
     * 按乘法规则: T1(m) * T2(n) = O(f(m) * f(n))
     * @param m
     * @param n
     * @return
     */
    int Omn(int m, int n){
        int sum1 = 0;
        for (int i = 0; i < m; i++) {
            sum1 += i;
        }

        int sum2 = 0;
        for (int j = 0; j < n; j++) {
            sum2 += j;
        }

        return sum1 + sum2;
    }
}
