// Possible or Not
// Om has an array 
// 𝐴
// A of size 
// 𝑁
// N and an integer 
// 𝐵
// B.

// He wants to find whether there exists a non-empty subsequence of 
// 𝐴
// A such that the bitwise AND of all elements in the subsequence is equal to 
// 𝐵
// B.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains two space-separated integers 
// 𝑁
// N and 
// 𝐵
// B — the size of array and the target integer, respectively.
// The second line of each test case contains 
// 𝑁
// N space-separated integers, the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   integer representing the element at the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   index.
// Output Format
// For each test case, output YES if any such subsequence exists and NO otherwise.

// You may print each character in uppercase or lowercase. For example YES, Yes, yes, and yES are all considered the same.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 1
// 0
// 5
// 1≤T≤10 
// 5
 
// 1
// ≤
// 𝑁
// ≤
// 1
// 0
// 5
// 1≤N≤10 
// 5
 
// 0
// ≤
// 𝐵
// <
// 2
// 30
// 0≤B<2 
// 30
 
// 0
// ≤
// 𝐴
// 𝑖
// <
// 2
// 30
// 0≤A 
// i
// ​
//  <2 
// 30
 
// The sum of 
// 𝑁
// N over all test cases won't exceed 
// 6
// ⋅
// 1
// 0
// 5
// 6⋅10 
// 5
//  .
// Sample 1:
// Input
// Output
// 2
// 6 5
// 1 7 3 4 2 13
// 3 2
// 1 3 4
// YES
// NO
// Explanation:
// Test case 
// 1
// 1: Consider the subsequence 
// [
// 𝐴
// 2
// ,
// 𝐴
// 6
// ]
// [A 
// 2
// ​
//  ,A 
// 6
// ​
//  ]. The bitwise AND of the elements is 
// 7
// &
// 13
// =
// 5
// 7&13=5.

// Test case 
// 2
// 2: It can be shown that no subsequence satisfies the condition.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0){
		    int n=sc.nextInt();
		    int b=sc.nextInt();
		    int arr[]=new int[n];
		    int count=-1;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if((b&arr[i])==b){
		            count&=arr[i];
		        }
		    }
		    if(count==b) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
//Input
// 2
// 6 5
// 1 7 3 4 2 13
// 3 2
// 1 3 4
//Output
// YES
// NO