
// Code
// Testcase
// Testcase
// Test Result
// 1991. Find the Middle Index in Array
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

// Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

 

// Example 1:

// Input: nums = [2,3,-1,8,4]
// Output: 3
// Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
// The sum of the numbers after index 3 is: 4 = 4
// Example 2:

// Input: nums = [1,-1,4]
// Output: 2
// Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
// The sum of the numbers after index 2 is: 0
// Example 3:

// Input: nums = [2,5]
// Output: -1
// Explanation: There is no valid middleIndex.
 

// Constraints:

// 1 <= nums.length <= 100
// -1000 <= nums[i] <= 1000
  public class middleindexinanarray {
        public int pivotIndex(int[] nums) {
            // Initialize total sum of the given array...
            int totalSum = 0;
            // Initialize 'leftsum' as sum of first i numbers, not including nums[i]...
            int leftsum = 0;
            // Traverse the elements and add them to store the totalSum...
            for (int ele : nums)
                totalSum += ele;
            // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
            for (int i = 0; i < nums.length; leftsum += nums[i++])
                // sum to the left == leftsum.
                // sum to the right === totalSum - leftsum - nums[i]..
                // check if leftsum == totalSum - leftsum - nums[i]...
                if (leftsum * 2 == totalSum - nums[i])
                    return i;       // Return the pivot index...
            return -1;      // If there is no index that satisfies the conditions in the problem statement...
        }
    }    

//Same as pivotindex
