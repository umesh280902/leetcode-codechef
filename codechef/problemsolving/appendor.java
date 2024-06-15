// Append for OR
// Chef has an array 
// 𝐴
// A of length 
// 𝑁
// N.

// Chef wants to append a non-negative integer 
// 𝑋
// X to the array 
// 𝐴
// A such that the bitwise OR of the entire array becomes 
// =
// 𝑌
// =Y i.e. 
// (
// 𝐴
// 1
 
// ∣
 
// 𝐴
// 2
 
// ∣
 
// …
 
// ∣
 
// 𝐴
// 𝑁
 
// ∣
 
// 𝑋
// )
// =
// 𝑌
// (A 
// 1
// ​
//   ∣ A 
// 2
// ​
//   ∣ … ∣ A 
// N
// ​
//   ∣ X)=Y. (Here, 
// ∣
// ∣ denotes the bitwise OR operation)

// Determine the minimum possible value of 
// 𝑋
// X. If no possible value of 
// 𝑋
// X exists, output 
// −
// 1
// −1.

// Input Format
// The first line contains a single integer 
// 𝑇
// T — the number of test cases. Then the test cases follow.
// The first line of each test case contains two integers 
// 𝑁
// N and 
// 𝑌
// Y — the size of the array 
// 𝐴
// A and final bitwise OR of the array 
// 𝐴
// A.
// The second line of each test case contains 
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
//   denoting the array 
// 𝐴
// A.
// Output Format
// For each test case, output the minimum possible value of 
// 𝑋
// X for which 
// (
// 𝐴
// 1
 
// ∣
 
// 𝐴
// 2
 
// ∣
 
// …
 
// ∣
 
// 𝐴
// 𝑁
 
// ∣
 
// 𝑋
// )
// =
// 𝑌
// (A 
// 1
// ​
//   ∣ A 
// 2
// ​
//   ∣ … ∣ A 
// N
// ​
//   ∣ X)=Y holds.

// If no such value exists, output 
// −
// 1
// −1.

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
// 𝐴
// 𝑖
// <
// 2
// 20
// 0≤A 
// i
// ​
//  <2 
// 20
 
// 0
// ≤
// 𝑌
// <
// 2
// 20
// 0≤Y<2 
// 20
 
// Sum of 
// 𝑁
// N over all test cases does not exceed 
// 2
// ⋅
// 1
// 0
// 5
// 2⋅10 
// 5
 
// Sample 1:
// Explanation:
// Test Case 1: 
// (
// 3
 
// ∣
 
// 5
 
// ∣
 
// 6
 
// ∣
 
// 2
 
// ∣
 
// 𝑋
// )
// =
// 15
// (3 ∣ 5 ∣ 6 ∣ 2 ∣ X)=15 holds for the following values of 
// 𝑋
// X: 
// {
// 8
// ,
// 9
// ,
// 10
// ,
// 11
// ,
// 12
// ,
// 13
// ,
// 14
// ,
// 15
// }
// {8,9,10,11,12,13,14,15}. The minimum among them is 
// 8
// 8.

// Test Case 2: It can be proven that no valid value of 
// 𝑋
// X exists.

// Test Case 3: 
// (
// 0
 
// ∣
 
// 𝑋
// )
// =
// 1
// (0 ∣ X)=1 holds for only 
// 𝑋
// =
// 1
// X=1.

/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int n=sc.nextInt();
		    int Y=sc.nextInt();
		    int ar[]=new int[n];
		    ar[0]=sc.nextInt();
		    int temp=ar[0];
		  
		    for(int i=1;i<n;i++){
		        ar[i]=sc.nextInt();
		     
		        temp=temp|ar[i];
		    }
		    
		   int x=-1;
		   for(int k=0;k<=Y;k++){
		       if((temp|k)==Y){
		       x=k;
		       break;
		       }
		   }
		   System.out.println(x);
		}
		  
	}
}

// Input
// 4
// 4 15
// 3 5 6 2
// 3 8
// 1 2 1
// 1 1
// 0
// 5 7
// 1 2 4 2 1
// Output
// 8
// -1
// 1
// 0
