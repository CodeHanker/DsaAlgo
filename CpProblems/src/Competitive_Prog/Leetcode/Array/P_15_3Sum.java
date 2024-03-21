package Competitive_Prog.Leetcode.Array;

import java.util.List;

public class P_15_3Sum {

    /*
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets

    Notice that the solution set must not contain duplicate triplets.

    Example 1:
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.     ->  [-1,0,1]
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.     ->  [0,1,-1]      (ignored due to duplicate triplets)
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.  ->  [-1,2,-1]

    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
    */

    public List<List<Integer>> threeSum(int[] nums) {
        int arrLen = nums.length;
        for(int i=0; i<arrLen; i++) {
            for(int j=i+1, k=0; j<arrLen-1; j++)
            {
                if(nums[i] + nums[j] + nums[j+1] == 0) {
                    
                }
            }
        }
        return null;
    }
}
