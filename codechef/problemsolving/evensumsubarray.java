// Even Sum Subarray
// Given an array 
// 𝐴
// A of size 
// 𝑁
// N, find the size of the largest subarray of 
// 𝐴
// A which has an even sum.

// For example, for the array 
// [
// 2
// ,
// 1
// ,
// 2
// ]
// [2,1,2] the answer is just 
// 1
// 1 as the largest subarray with an even sum is 
// [
// 2
// ]
// [2].

// Note that a subarray is a contiguous part of an array. For the array 
// [
// 1
// ,
// 3
// ,
// 2
// ]
// [1,3,2], some possible subarrays are 
// [
// 1
// ]
// ,
// [
// 2
// ]
// ,
// [
// 1
// ,
// 3
// ]
// ,
// [
// 1
// ,
// 3
// ,
// 2
// ]
// [1],[2],[1,3],[1,3,2]. However, 
// [
// 1
// ,
// 2
// ]
// [1,2] is not a subarray for this array.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains a single integer 
// 𝑁
// N — the size of the array.
// The next line contains 
// 𝑁
// N space-separated integer - 
// 𝐴
// 1
// ,
// 𝐴
// 2
// ,
// …
// ,
// 𝐴
// 𝑁
// A 
// 1
// ​
//  ,A 
// 2
// ​
//  ,…,A 
// N
// ​
//  .
// Output Format
// For each test case, output on a new line, the size of the largest subarray with even sum.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 50
// 1≤T≤50
// 1
// ≤
// 𝑁
// ≤
// 50
// 1≤N≤50
// 1
// ≤
// 𝐴
// 𝑖
// ≤
// 1
// 0
// 4
// 1≤A 
// i
// ​
//  ≤10 
// 4
 
// Sample 1:
// Input
// Output
// 4
// 3
// 2 1 2
// 3
// 1 3 2
// 6
// 2 2 1 1 1 2
// 1
// 1
// 1
// 3
// 4
// 0
// Explanation:
// Test case 
// 1
// 1: The largest subarray with even sum is the subarray 
// [
// 2
// ]
// [2] having size 
// 1
// 1.

// Test case 
// 2
// 2: The largest subarray with even sum is the subarray 
// [
// 1
// ,
// 3
// ,
// 2
// ]
// [1,3,2] having size 
// 3
// 3.

// Test case 
// 3
// 3: The largest subarray with even sum is the subarray 
// [
// 2
// ,
// 2
// ,
// 1
// ,
// 1
// ]
// [2,2,1,1] having size 
// 4
// 4.

// Test case 
// 4
// 4: No subarray has even sum.
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int totalSum = 0;
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                totalSum += A[i];
            }
            
            if (totalSum % 2 == 0) {
                System.out.println(N);
            } else {
                int maxLength = 0;
                for (int i = 0; i < N; i++) {
                    if (A[i] % 2 != 0) {
                        maxLength = Math.max(maxLength, Math.max(i, N - i - 1));
                    }
                }
                System.out.println(maxLength);
            }
        }
        
        sc.close();
	}
}