package com.seven.javaalgorithm.algorithm;

/**
 * 2、两数之和
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */
public class LeetCode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        //head保存新的链表头对象，，tail记录每次next操作时的对象
        ListNode head = null, tail = null;
        int carry = 0;//两数相加达到10两位数 进行进一位得数
        while (l1 != null || l2 != null){
            int num1 = l1 != null? l1.val : 0;
            int num2 = l2 != null? l2.val : 0;
            int sum = num1 + num2 + carry;
            if(head == null){
                head = tail = new ListNode(sum % 10);
            }else{
                tail.next = new ListNode(sum % 10);
                tail = tail.next;//tail记录最新的对象
            }
            carry = sum / 10;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }





    public class ListNode {
        int val;
        ListNode next;

        public ListNode(){

        }

        public ListNode(int val){
            this.val = val;
        }

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

    }
}


