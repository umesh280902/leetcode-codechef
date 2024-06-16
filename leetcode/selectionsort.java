// 75. Sort Colors
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.

public class selectionsort {

        public void sortColors(int[] nums) {
            int n=nums.length;
            for(int i=0;i<n-1;i++){
                int index=i;
                for(int j=i+1;j<n;j++){
                    if(nums[j]<nums[index]){
                        index=j;
                    }
                }
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
    
            }
        }
}


// Here is the code for selection sort 
// void sort(int arr[])
//     {
//         int n = arr.length;

//         // One by one move boundary of unsorted subarray
//         for (int i = 0; i < n-1; i++)
//         {
//             // Find the minimum element in unsorted array
//             int min_idx = i;
//             for (int j = i+1; j < n; j++)
//                 if (arr[j] < arr[min_idx])
//                     min_idx = j;

//             // Swap the found minimum element with the first
//             // element
//             int temp = arr[min_idx];
//             arr[min_idx] = arr[i];
//             arr[i] = temp;
//         }
//     }

// Time complexity is O(n^2);