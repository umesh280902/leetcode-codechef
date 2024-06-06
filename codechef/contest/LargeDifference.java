
// Large Differences
// You are given an array 
// 𝐴
// A of length 
// 𝑁
// N, and a positive integer 
// 𝐾
// K.
// It is guaranteed that 
// 1
// ≤
// 𝐴
// 𝑖
// ≤
// 𝐾
// 1≤A 
// i
// ​
//  ≤K for every index 
// 𝑖
// i from 
// 1
// 1 to 
// 𝑁
// N.

// You can do the following at most once:

// Choose an index 
// 𝑖
// i (
// 1
// ≤
// 𝑖
// ≤
// 𝑁
// 1≤i≤N) and a value 
// 𝑥
// x (
// 1
// ≤
// 𝑥
// ≤
// 𝐾
// 1≤x≤K).
// Then, set 
// 𝐴
// 𝑖
// :
// =
// 𝑥
// A 
// i
// ​
//  :=x.
// Find the maximum possible value of the sum of adjacent differences of 
// 𝐴
// A after performing this operation at most once.
// That is, maximize the quantity

// ∑
// 𝑖
// =
// 1
// 𝑁
// −
// 1
// ∣
// 𝐴
// 𝑖
// −
// 𝐴
// 𝑖
// +
// 1
// ∣
// i=1
// ∑
// N−1
// ​
//  ∣A 
// i
// ​
//  −A 
// i+1
// ​
//  ∣
// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of two lines of input.
// The first line of each test case contains two space-separated integers 
// 𝑁
// N and 
// 𝐾
// K — the length of the array and the maximum allowed integer 
// 𝐾
// K, respectively.
// The second line contains 
// 𝑁
// N space-separated integers 
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
//  , the elements of array 
// 𝐴
// A.
// Output Format
// For each test case, output on a new line the answer: the maximum possible sum of adjacent differences of 
// 𝐴
// A after replacing at most one element.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 100
// 1≤T≤100
// 1
// ≤
// 𝑁
// ≤
// 1000
// 1≤N≤1000
// 1
// ≤
// 𝐾
// ≤
// 2
// ⋅
// 1
// 0
// 6
// 1≤K≤2⋅10 
// 6
 
// 1
// ≤
// 𝐴
// 𝑖
// ≤
// 𝐾
// 1≤A 
// i
// ​
//  ≤K
// The sum of 
// 𝑁
// N across all tests won't exceed 
// 1000
// 1000.
// Sample 1:
// Input
// Output
// 3
// 2 5
// 1 5
// 3 8
// 7 2 7
// 5 20
// 18 3 1 4 19
// 4
// 12
// 63
// Explanation:
// Test case 
// 1
// 1: It's best to leave the array unchanged, giving us a difference of 
// ∣
// 1
// −
// 5
// ∣
// =
// 4
// ∣1−5∣=4.

// Test case 
// 2
// 2: It's optimal to set 
// 𝐴
// 2
// :
// =
// 1
// A 
// 2
// ​
//  :=1, giving us the array 
// [
// 7
// ,
// 1
// ,
// 7
// ]
// [7,1,7]. The sum of adjacent differences is 
// 6
// +
// 6
// =
// 12
// 6+6=12.

// Test case 
// 3
// 3: It's optimal to set 
// 𝐴
// 3
// :
// =
// 20
// A 
// 3
// ​
//  :=20, to obtain 
// [
// 18
// ,
// 3
// ,
// 20
// ,
// 4
// ,
// 19
// ]
// [18,3,20,4,19]. The sum of adjacent differences is 
// 63
// 63.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    int n = sc.nextInt();
		    long k = sc.nextLong();
		    
		    long a[] = new long[n];
		    
		    for(int i =0;i<n;i++)
		    a[i] = sc.nextLong();
		   
		   long com=0,com1=0,prev,prevcom=0;
		   
		   for(int i =0;i<n;i++)
		   {
		       prev = a[i];
		     a[i]=1;
		    com = sum(a,n);
		    a[i]=k;
		    com1 = Math.max(com,sum(a,n));
		    a[i] = prev;
		    prevcom=Math.max(prevcom,com1);
		    
		   }
		   
		   System.out.println(prevcom);
		   
		    
		    
		}
	}
	
	public static long sum(long a[],int n)
	{ int sum =0;
	   for(int i =0;i<n-1;i++)
	  sum+=Math.abs(a[i]-a[i+1]);
	  return sum;
	}
	
	
}

// Input
// 3
// 2 5
// 1 5
// 3 8
// 7 2 7
// 5 20
// 18 3 1 4 19
//Output
// 4
// 12
// 63