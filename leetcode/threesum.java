// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.
 

// Constraints:

// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105
// Intuition of this Problem:
// Set is used to prevent duplicate triplets and parallely we will use two pointer approach to maintain J and k.

// NOTE - PLEASE READ APPROACH FIRST THEN SEE THE CODE. YOU WILL DEFINITELY UNDERSTAND THE CODE LINE BY LINE AFTER SEEING THE APPROACH.

// Approach for this Problem:
// Sort the input array
// Initialize a set to store the unique triplets and an output vector to store the final result
// Iterate through the array with a variable i, starting from index 0.
// Initialize two pointers, j and k, with j starting at i+1 and k starting at the end of the array.
// In the while loop, check if the sum of nums[i], nums[j], and nums[k] is equal to 0. If it is, insert the triplet into the set and increment j and decrement k to move the pointers.
// If the sum is less than 0, increment j. If the sum is greater than 0, decrement k.
// After the while loop, iterate through the set and add each triplet to the output vector.
// Return the output vector
import java.util.*;
class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        int target=0;
        Arrays.sort(nums);
        List<List<Integer>> output=new ArrayList<>();
        HashSet<List<Integer>> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(target==sum){
                    hs.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else{
                    if(sum<target){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
        output.addAll(hs);
        return output;
    }
}