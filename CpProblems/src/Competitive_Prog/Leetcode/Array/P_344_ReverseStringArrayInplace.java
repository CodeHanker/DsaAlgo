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

public class P_344_ReverseStringArrayInplace {

    static void rvereseArray(String arr[])
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

    /* Utility that prints out an array on a line */
    static void printArray(String arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        //int arr[] = {1, 2, 3, 4, 5, 6};
        String arr[] = {"h","e","l","l","o"};
        printArray(arr);
        rvereseArray(arr);
        System.out.print("Reversed array is \n");
        printArray(arr);
    }
}
