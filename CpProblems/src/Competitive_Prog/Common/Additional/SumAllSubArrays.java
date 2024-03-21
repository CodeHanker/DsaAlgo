package Competitive_Prog.Common.Additional;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class SumAllSubArrays {

    /*
    Problem: Sum of all subArrays (contiguous-sub-array)

    Lesson: always ask clarifying questions

    BF APPROACH:
        Generate all subarrays using nested three loops
        Take the sum of all these subarrays
    Complexity
        Time complexity: O(n^3) [Big O of N-Cubed]
        Space complexity: O(1)
    */

    public static int sumOfSubArrayTcNCubed(int[] nums) {
        int len = nums.length;
        int subArraysSum = 0;
        //Traversing from Start Point
        for (int startPoint=0; startPoint<len; startPoint++) {

            //Traversing for sub arrays
            for(int grps=startPoint; grps<=len; grps++) {
                //if start point = 1 then
                //grp size = 1 , print 1
                //grp size = 2, print 1 2
                //grp size = 3, print 1 2 3 ans so on

                //Summing a subArray
                for(int i=startPoint; i<grps; i++) {
                    subArraysSum += nums[i];
                }
            }
        }
        return subArraysSum;
    }

    /*
    Better APPROACH:
    Generate all subarrays using nested two loops
    Take the sum of all these subarrays

    Complexity
    Time complexity: O(n^2) [Big O of N-Squared]
    Space complexity: O(1)
    */
    public static int sumOfSubArrayTcNSquared(int[] nums) {
        int len = nums.length;
        int subArraysSum = 0; int temp = 0;
        //Traversing from Start Point
        for (int startPoint=0; startPoint<len; startPoint++) {
            temp = 0;
            //Traversing for sub arrays and summing
            for(int grps=startPoint; grps<len; grps++) {
                // sum subarray between current
                // starting and ending points
                temp = temp + nums[grps];
                subArraysSum = subArraysSum + temp;
            }
        }
        return subArraysSum;
    }

    public static void main(String[] args) {
        int[] inputArr = {1,2,3};
        System.out.println("InputArray : " + Arrays.toString(inputArr));
        GeneratingSubArrays generatingSubArrays = new GeneratingSubArrays();
        generatingSubArrays.generateSubArrays(inputArr, inputArr.length);

        //BruteForce APPROACH - TC - N-CUBED
        int sumOfSubArrays = sumOfSubArrayTcNCubed(inputArr);
        System.out.println("TC:N-CUBED   -> sumOfSubArrays : " + sumOfSubArrays);

        //A Bit Optimized APPROACH - TC - N-CUBED
        sumOfSubArrays = sumOfSubArrayTcNSquared(inputArr);
        System.out.println("TC:N-SQUARED -> sumOfSubArrays : " + sumOfSubArrays);







    }

}
