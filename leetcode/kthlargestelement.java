// 215. Kth Largest Element in an Array
// Solved
// Medium
// Topics
// Companies
// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Can you solve it without sorting?

 

// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
// Example 2:

// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4
 

// Constraints:

// 1 <= k <= nums.length <= 105
// -104 <= nums[i] <= 104

import java.util.*;
class kthlargestelement     {
    public int findKthLargest(int[] nums, int k) {
        // Min-heap to maintain the k largest elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); // Remove the smallest element in the heap
            }
        }

        // The root of the heap is the kth largest element
        return pq.peek();
    }
}
//Approach add all the elements in priority queue and if exceeds size k the poll the smallest element in heap
//The time complexity is O(nlogk)