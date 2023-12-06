package Competitive_Prog.Leetcode.Array;

/*
Intuition
    Two pointers approach for in-place swapping as there should not be use of extra memory

Approach
    Initialize start and end indexes as start = 0, end = arrayLength-1
    In a loop, swap arr[start] with arr[end] and change start and end as follows :
    start = start+1, end = end-1

Complexity
    Time complexity: O(n)
    Space complexity: O(1)
 */

import Competitive_Prog.Common.Utility.PrintArray;

import java.util.Arrays;

public class P_344_ReverseStringArrayInplace {

    static void reverseArray(String arr[])
    {
        String temp;
        int end = arr.length-1;
        for(int start = 0; start < end; start++, end--) {
            //in-place swapping using two-pointers
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    // Driver code
    public static void main(String args[]) {

        //int arr[] = {1, 2, 3, 4, 5, 6};
        String arr[] = {"h","e","l","l","o"};
        PrintArray.printArray(arr);
        reverseArray(arr);
        System.out.print("Reversed array is \n");
        PrintArray.printArray(arr);
    }
}
