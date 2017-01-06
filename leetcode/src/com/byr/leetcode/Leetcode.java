package com.byr.leetcode;

import java.util.Arrays;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author maz22
 * @version 1.0
 * @create 2017/1/5
 * @since 1.0
 */
public class Leetcode {

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(x ^ y);
    }

    /*
    The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
    Given two integers x and y, calculate the Hamming distance.

    Note:
    0 ≤ x, y < 231.

    Input: x = 1, y = 4

    Output: 2

    Explanation:
    1   (0 0 0 1)
    4   (0 1 0 0)
           ↑   ↑

    The above arrows point to positions where the corresponding bits are different.
     */

    public static int hammingDistance(int x, int y) {
        int i = x ^ y;
        int count=0;
        while (i != 0) {
            ++ count;
            i = (i-1)& i;
        }
        return count;
    }

    /*
    Given an array of integers, every element appears twice except for one. Find that single one.

    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     */
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i+=2) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            } else {
                continue;
            }
        }

        return nums[nums.length-1];
    }

    /*
    Write a function that takes a string as input and returns the string reversed.

    Example:
    Given s = "hello", return "olleh".

     */
    public static String reverseString(String s) {

        String str = "";

        if(s.length() <= 1) {
            return s;
        } else {
            str = reverseString(s.substring(s.length()/2, s.length())) + reverseString(s.substring(0, s.length()/2));
        }

        return str;
    }



}

