// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

// Constraints:

// 3 <= nums.length <= 500
// -1000 <= nums[i] <= 1000
// -104 <= target <= 104
import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        int closeSum=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                 sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closeSum))
                closeSum=sum;
               else  if(sum<target) j++;
                else
                k--;
            }
        }
        return closeSum;
    }
}