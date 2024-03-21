package Competitive_Prog.Leetcode.Array;

import Competitive_Prog.Common.Utility.PrintArray;

import java.util.ArrayList;
import java.util.Arrays;

public class P_53_MaximumSubarray {
    /*
    Problem:
        Largest Sum Contiguous Subarray (Kadane’s Algorithm)
        Largest Sum Contiguous Subarray (Kadane’s Algorithm) GFG

        Given an integer array nums, find the subarray  with the largest sum, and return its sum.
        Follow up: If you have figured out the O(n) solution, try coding another solution using
            the divide and conquer approach, which is more subtle.

    Constraints:
     1    <= nums.length <= 10^5
    -104  <= nums[i]     <= 10^4


    Confusion:
    Question is related to continous-subArray
    In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/substrings.

    Algorithm:
    Simple single-pass algorithm known as Kadane's algorithm solves it efficiently.
     */

    //Utility to print subArray that has maxSum
    ArrayList<Integer> subArrayHavingMaxSum = new ArrayList<>();
    public int maxSubArray(int[] nums) {

        int maxSum_soFar = Integer.MIN_VALUE;
        int subArrayMaxSum = 0;

        for(int i=0; i<nums.length; i++) {
            subArrayMaxSum += nums[i];

            subArrayHavingMaxSum.add(nums[i]);
            if(subArrayMaxSum > maxSum_soFar) {
                maxSum_soFar = subArrayMaxSum;
            }
            if(subArrayMaxSum < 0) {
                subArrayMaxSum = 0;
                subArrayHavingMaxSum.clear();
            }
        }
        return maxSum_soFar;
    }

    public static void main(String[] args) {
        P_53_MaximumSubarray p_53_MaximumSubarray = new P_53_MaximumSubarray();
        int[] inputArr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("InputArray : " + Arrays.toString(inputArr));
        int result = p_53_MaximumSubarray.maxSubArray(inputArr);
        System.out.println("Result : " + result + " and SubArray : " + p_53_MaximumSubarray.subArrayHavingMaxSum);

        System.out.println();

        P_53_MaximumSubarray p_53_MaximumSubarray1 = new P_53_MaximumSubarray();
        int[] inputArr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("InputArray1 : " + Arrays.toString(inputArr1));
        int result1 = p_53_MaximumSubarray1.maxSubArray(inputArr1);
        System.out.println("Result1 : " + result1 + " and SubArray : " + p_53_MaximumSubarray1.subArrayHavingMaxSum);

        System.out.println();

        P_53_MaximumSubarray p_53_MaximumSubarray2 = new P_53_MaximumSubarray();
        int[] inputArr2 = {5,4,-1,7,8};
        System.out.println("InputArray2 : " + Arrays.toString(inputArr2));
        int result2 = p_53_MaximumSubarray2.maxSubArray(inputArr2);
        System.out.println("result2 : " + result2 + " and SubArray : " + p_53_MaximumSubarray2.subArrayHavingMaxSum);

        System.out.println();

        P_53_MaximumSubarray p_53_MaximumSubarray3 = new P_53_MaximumSubarray();
        int[] inputArr3 = {1};
        System.out.println("InputArray3 : " + Arrays.toString(inputArr3));
        int result3 = p_53_MaximumSubarray3.maxSubArray(inputArr3);
        System.out.println("result3 : " + result3 + " and SubArray : " + p_53_MaximumSubarray3.subArrayHavingMaxSum);
    }
}
