package Competitive_Prog.Interview.PSI;

import java.util.Arrays;

public class MergedOrderedArray {

    /*
            arr1[] = {1,3,5,7}
            arr2[] = {2,4,6}
            arr3[] = {1,2,3,4,5,6,7}   //Merged array
     */

    public static void main(String args[]) {

        int arr1[] = new int[] {1,3,5,7};
        int arr2[] = new int[] {2,4,6};

        int arr3[] = new int[arr1.length + arr2.length];

        int even = 0;
        int odd = 1;

        /*
        //Bruteforce first

        for(int i=0; i<arr1.length; i++) {
            arr3[even] = arr1[i];
            even += 2;
        }
        for(int i=0; i<arr2.length; i++) {
            arr3[odd] = arr2[i];
            odd += 2;
        }
        System.out.println(Arrays.toString(arr3));*/

        //using one loop
        for(int i=0; i<arr1.length; i++) {
            arr3[even] = arr1[i];
            even += 2;

            if(i == arr1.length -1 )
                break;

            arr3[odd] = arr2[i];
            odd += 2;
        }
        System.out.println(Arrays.toString(arr3));


    }
}
