package com.seven.javaalgorithm.datastructure.linklist;


import java.util.LinkedList;

/**
 * 链表（LinkList）-常用应用场景：LRU缓存淘汰算法
 *
 * 缓存淘汰算法: 先进先出策略、最少使用策略、最近最少使用策略
 *
 * 特点：
 *      1、链表得内存地址可以是不连续、所以便于插入和删除，不便于查询特定元素位置
 *      2、便于插入、删除，时间复杂度为O(1), 查询时间复杂度为O(n)
 *
 *  一、链表结构:
 *      1、单链表   ：data1/next -> data2/next -> ... -> null    （next指向后一个节点，直到为null）
 *      2、循环链表 ：data1/next -> data2/next -> ... -> data1/next (next指向后一个。直到最后指向第一个)
 *      3、双向链表 : prev/data1/next -> prev/data2/next -> ... ->null   (prev指向前一个，next指向后一个，直到为null)
 *
 *   插入：
 *      1、头部节点判断为空的处理
 *          if(head == null){
 *              head = a
 *          }
 *      2、在a、a.next=c 中插入b ==>得到 a、a.next=b 、b.next=c
 *          a.next = b.next
 *          a.next = b
 *   删除：
 *      1、尾部节点判断为空处理
 *          if(head.next == null){
 *              head = null
 *          }
 *      2、删除节点a后面的节点b,直接指向C
 *         a = a.next.next
 *
 *    查询：
 *      利用哨兵来查询特定节点位置
 *
 *
 *  二、链表常用操作:
 *      1、单链表反转
 *      2、链表中环的检测
 *      3、两个有序链表合并
 *      4、删除链表第n个节点
 *      5、求链表的中间节点
 *
 */
public class ToLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        linkedList.peekFirst();
        System.out.print("linkedList = " + linkedList);
    }




}
