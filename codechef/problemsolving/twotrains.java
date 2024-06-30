// Two Trains
// There are 
// 2
// 2 trains 
// 𝐴
// A and 
// 𝐵
// B and 
// 𝑁
// N stations in a line from 
// 1
// 1 to 
// 𝑁
// N in order. There is also an array 
// 𝑃
// P of length 
// 𝑁
// −
// 1
// N−1 such that 
// 𝑃
// 𝑖
// P 
// i
// ​
  
// (
// 1
// ≤
// 𝑖
// <
// 𝑁
// )
// (1≤i<N) denotes the amount of time any train takes to go from the 
// 𝑖
// i-th station to the 
// (
// 𝑖
// +
// 1
// )
// (i+1)-th station.

// Initially, both trains are at station 
// 1
// 1. Train 
// 𝐴
// A departs from station 
// 1
// 1 and stops directly at station 
// 𝑁
// N. For safety purposes, it is maintained that train 
// 𝐵
// B cannot depart from station 
// 𝑖
// i unless train 
// 𝐴
// A has already reached station 
// (
// 𝑖
// +
// 1
// )
// (i+1) 
// (
// 1
// ≤
// 𝑖
// <
// 𝑁
// )
// (1≤i<N).

// Find the minimum time after which train 
// 𝐵
// B reaches station 
// 𝑁
// N, once train 
// 𝐴
// A departs from station 
// 1
// 1.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of two lines of input.
// The first line of each test case contains an integer 
// 𝑁
// N, denoting number of stations.
// The next line contains 
// 𝑁
// −
// 1
// N−1 space-separated integers, 
// 𝑃
// 1
// ,
// 𝑃
// 2
// ,
// …
// ,
// 𝑃
// 𝑁
// −
// 1
// P 
// 1
// ​
//  ,P 
// 2
// ​
//  ,…,P 
// N−1
// ​
//  .
// Output Format
// For each test case, output on a new line the minimum time after which train 
// 𝐵
// B reaches station 
// 𝑁
// N.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 100
// 1≤T≤100
// 2
// ≤
// 𝑁
// ≤
// 1
// 0
// 5
// 2≤N≤10 
// 5
 
// 1
// ≤
// 𝑃
// 𝑖
// ≤
// 1
// 0
// 3
// 1≤P 
// i
// ​
//  ≤10 
// 3
 
// The sum of 
// 𝑁
// N over all test cases won't exceed 
// 1
// 0
// 5
// 10 
// 5
//  .
// Sample 1:
// Input
// Output
// 3
// 2
// 4
// 3
// 3 5
// 4
// 5 2 6
// 8
// 13
// 19
// Explanation:
// Test case 
// 1
// 1: 
// 𝐴
// A reaches station 
// 2
// 2 at 
// 𝑡
// =
// 4
// t=4 and at this time 
// 𝐵
// B departs from station 
// 1
// 1 and reaches station 
// 2
// 2 at 
// 𝑡
// =
// 4
// +
// 4
// =
// 8
// t=4+4=8.

// Test case 
// 2
// 2: Following is the timeline of two trains-

// At 
// 𝑡
// =
// 3
// t=3, 
// 𝐴
// A reaches station 
// 2
// 2 and 
// 𝐵
// B departs from station 
// 1
// 1.
// At 
// 𝑡
// =
// 6
// t=6, 
// 𝐵
// B reaches station 
// 2
// 2 but 
// 𝐴
// A has not yet reached station 
// 3
// 3, so train 
// 𝐵
// B will wait at station 
// 2
// 2.
// At 
// 𝑡
// =
// 8
// t=8, 
// 𝐴
// A reaches station 
// 3
// 3 and 
// 𝐵
// B departs from station 
// 2
// 2.
// At 
// 𝑡
// =
// 8
// +
// 5
// =
// 13
// t=8+5=13, train 
// 𝐵
// B reaches station 
// 3
// 3.
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int n = sc.nextInt();
		    int[] p = new int[n-1];
		    
		    //initializing sum and max values
		    int sum =0;int max =0;
		    
		    //loop from 0 till end that is n-1 
		    for(int i=0;i<n-1;i++)
		    {
		        //put inputs accordingly in the array
		        p[i] = sc.nextInt();
		        //calculate sum while moving pointer to next
		        sum += p[i];
		        //Max betweeen the current element at position i and the max value hence only max value is occupying max variable
		        max = Math.max(p[i],max);
		    }
		    
		    //display the total that will be maximum time + total time
		   System.out.println(max+sum);
		    
		}
	}
}
