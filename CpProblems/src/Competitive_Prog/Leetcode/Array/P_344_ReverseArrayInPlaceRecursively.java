package Competitive_Prog.Leetcode.Array;

public class P_344_ReverseArrayInPlaceRecursively {

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        rvereseArray(s, start, end);
    }

    public static void rvereseArray(char[] arr, int start, int end)
    {
        char temp;

        //base-case
        if (start >= end)
            return;

        //in-place swapping using two-pointers
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        //recursive call
        rvereseArray(arr, start+1, end-1);
    }

    /* Utility that prints out an array on a line */
    static void printArray(char arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        //int arr[] = {1, 2, 3, 4, 5, 6};
        //char arr[] = {'s', 't', 'a', 'r', 'f', 'i', 's', 'h'};
        char arr[] = {'s', 't', 'a', 'r', 't'};
        printArray(arr);
        reverseString(arr);
        System.out.print("Reversed array is \n");
        printArray(arr);
    }


}
