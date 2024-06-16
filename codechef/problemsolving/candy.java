// Christmas Candy
// There are 
// 𝑁
// N friends numbered 
// 1
// 1 to 
// 𝑁
// N, seated in a straight line where the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   seat is taken by friend numbered 
// 𝐴
// 𝑖
// A 
// i
// ​
//  .

// This Christmas, the friends have decided to distribute candies amongst each other.
// For each 
// 1
// ≤
// 𝑖
// <
// 𝑁
// 1≤i<N, the friend at the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   seat will gift one candy to the friend at the 
// 𝑗
// 𝑡
// ℎ
// j 
// th
//   seat if:

// 𝑗
// >
// 𝑖
// j>i ;
// 𝐴
// 𝑗
// <
// 𝐴
// 𝑖
// A 
// j
// ​
//  <A 
// i
// ​
 
// Find the number of people who receive at least one candy.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains an integer 
// 𝑁
// N — the number of friends.
// The next line contains 
// 𝑁
// N space-separated integers denoting the array 
// 𝐴
// A.
// Output Format
// For each test case, output on a new line, the number of people who receive at least one candy.

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
// 𝐴
// 𝑖
// ≤
// 𝑁
// ,
 
// 𝐴
// 𝑖
// 1≤A 
// i
// ​
//  ≤N, A 
// i
// ​
//   is distinct.
// The sum of 
// 𝑁
// N over all test cases won't exceed 
// 1
// 0
// 6
// 10 
// 6
//  .
// Sample 1:

// Explanation:
// Test case 
// 1
// 1: No friend will receive any candy based on the order in which they are sitting.

// Test case 
// 2
// 2: Friends at seat 
// 𝑗
// =
// 2
// j=2 and 
// 𝑗
// =
// 3
// j=3 would receive one candy each from friend at seat 
// 𝑖
// =
// 1
// i=1.

// Test case 
// 3
// 3: Friend at seat 
// 𝑗
// =
// 4
// j=4 would receive candy from friends at seat 
// 𝑖
// =
// 1
// ,
// 2
// ,
// 3
// i=1,2,3.
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int Tan=sc.nextInt();
	    while(Tan-->0)
	    {
	        int m = sc.nextInt();
	        int arr[] = new int[m];
	        for(int a=0;a<m;a++)
	        {
	            arr[a] = sc.nextInt();
	        }
	        int R[] =new int[m];
	        int out = 0;
	        int max = 0;
	        for(int a=0;a<m;a++)
	        {
	            max = Math.max(max,arr[a]);
	            R[a]=max;
	        }
	        for(int a=0;a<m;a++)
	        {
	            if(arr[a]<R[a])
	            {
	                out++;
	            }
	        }
	        System.out.println(out);
	    }

	}
}

// Input
// 3
// 2
// 1 2
// 3
// 3 1 2
// 4
// 2 3 4 1
// Output
// 0
// 2
// 1