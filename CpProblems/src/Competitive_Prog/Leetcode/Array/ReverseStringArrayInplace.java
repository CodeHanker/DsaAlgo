package Competitive_Prog.Leetcode.Array;

public class ReverseStringArrayInplace {

    static void rvereseArray(String arr[])
    {
        String temp;
        int end = arr.length-1;
        for(int i = 0; i < end; i++, end--) {
            //in-place swapping
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }
    }

    /* Utility that prints out an
    array on a line */
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
