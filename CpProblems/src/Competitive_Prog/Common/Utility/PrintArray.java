package Competitive_Prog.Common.Utility;

public class PrintArray {

    /* Utility that prints out an array on a line */
    public static void printArray(String arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
