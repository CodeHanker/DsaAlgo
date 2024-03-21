package Competitive_Prog.Common.Additional;

import java.util.Arrays;

public class PrefixSumArray {

    /*
    Given an array arr[] of size N, find the prefix sum of the array.

    A prefix sum array is another array prefixSum[] of the same size,
    such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].
    OR -> current ith value in the array is calculated by adding
    all previous value's in the array to current value of ith value.

    Examples:
    Input: arr[] = {10, 20, 10, 5, 15}
    Output: prefixSum[] = {10, 30, 40, 45, 60}
    Explanation: While traversing the array, update the element by adding it with its previous elements.
    prefixSum[0] = 10,
    prefixSum[1] = prefixSum[0] + arr[1] = 30,
    prefixSum[2] = prefixSum[1] + arr[2] = 40 and so on.

    Approach: To solve the problem follow the given steps:
        Declare a new array prefixSum[] of the same size as the input array
        Run a for loop to traverse the input array
        For each index add the value of the current element and the previous value of the prefix sum array
     */

    private static void fillPrefixSum(int[] arr, int n, int[] prefixSum) {

        prefixSum[0] = arr[0];
        for (int i=1; i<arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int inputArr[] = { 10, 4, 16, 20 };
        int n = inputArr.length;
        int prefixSum[] = new int[n];

        System.out.println("InputArray : " + Arrays.toString(inputArr));
        fillPrefixSum(inputArr, n, prefixSum);
        System.out.println("prefixSum : " + Arrays.toString(prefixSum));
    }


}
