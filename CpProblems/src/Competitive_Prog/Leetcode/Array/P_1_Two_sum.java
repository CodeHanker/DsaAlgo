package Competitive_Prog.Leetcode.Array;

import Competitive_Prog.Common.Utility.PrintArray;

import java.util.HashMap;
import java.util.Map;

public class P_1_Two_sum {

    /*
    Bruteforce solution
    Time complexity: O(n^2)
    */
    public static int[] twoSumBrutForce(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};  //no solution found
        //or throw new IllegalArgumentException("No solution");
    }


    /*
    Optimized Solution using HashMap(HashTable) - one-pass
    Time complexity: O(n)
    */
    public static int[] twoSumHashMap(int[] nums, int target) {
        //Hashmap containing unmatched complement values
        Map<Integer, Integer> complementsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            //finding complement
            //looking for complement, if found return indeces as an array
            int complement = target - nums[i];
            if (complementsMap.containsKey(complement)) {
                return new int[]{complementsMap.get(complement), i};
            }
            //Adding value and index - key-value pair to complementMap
            complementsMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int target = 17;
        //int[] result = twoSumBrutForce(new int[]{2,7,11,15}, 17);
        int[] result1 = twoSumBrutForce(input,target);
        PrintArray.printArray(result1);
        int[] result2 = twoSumHashMap(input,target);
        PrintArray.printArray(result2);
    }
}
