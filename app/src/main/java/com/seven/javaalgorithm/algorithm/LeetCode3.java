package com.seven.javaalgorithm.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

/**
 * 3、无重复字符的最长子串
 *
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 */
public class LeetCode3 {
    public int lengthOfLongestSubString(String s){
        int max = 0;
        ArrayList list = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            int index = list.indexOf(s.charAt(i));
            if(index != -1){
                while (index >=0 ){
                    list.remove(index);
                    index -= 1;
                }
                list.add(s.charAt(i));
            }else{
                list.add(s.charAt(i));
            }

            if(list.size() > max){
                max = list.size();
            }
        }
        return max;
    }

}
