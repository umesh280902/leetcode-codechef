// 350. Intersection of Two Arrays II
// Solved
// Easy
// Topics
// Companies
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionofarray {
    // Runtime: 1 ms, faster than 99.13% of Java online submissions for Intersection of Two Arrays II.
// Memory Usage: 42.5 MB, less than 92.71% of Java online submissions for Intersection of Two Arrays II.
    public int[] intersect(int[] nums1, int[] nums2) {
        // Sort both the arrays first...
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // Create an array list...
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // Use two pointers i and j for the two arrays and initialize both with zero.
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            // If nums1[i] is less than nums2[j]...
            // Leave the smaller element and go to next(greater) element in nums1...
            if(nums1[i] < nums2[j]) {
                i++;
            }
            // If nums1[i] is greater than nums2[j]...
            // Go to next(greater) element in nums2 array...
            else if(nums1[i] > nums2[j]){
                j++;
            }
            // If both the elements intersected...
            // Add this element to arr & increment both i and j.
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        // Create a output list to store the output...
        int[] output = new int[arr.size()];
        int k = 0;
        while(k < arr.size()){
            output[k] = arr.get(k);
            k++;
        }
        return output;
    }

}
