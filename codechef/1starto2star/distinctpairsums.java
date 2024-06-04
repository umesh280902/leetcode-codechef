// You are given a range of integers 
// {
// 𝐿
// ,
// 𝐿
// +
// 1
// ,
// …
// ,
// 𝑅
// }
// {L,L+1,…,R}. An integer 
// 𝑋
// X is said to be reachable if it can be represented as a sum of two not necessarily distinct integers in this range. Find the number of distinct reachable integers.

// Input
// The first line of the input contains a single integer 
// 𝑇
// T denoting the number of test cases. The description of 
// 𝑇
// T test cases follows.
// The first and only line of each test case contains two space-separated integers 
// 𝐿
// L and 
// 𝑅
// R.
// Output
// For each test case, print a single line containing one integer — the number of reachable integers.

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
// 𝐿
// ≤
// 𝑅
// ≤
// 1
// 0
// 6
// 1≤L≤R≤10 
// 6
 
// Sample 1:
// Input
// Output
// 2
// 2 2
// 2 3
// 1
// 3
// Explanation:
// Example case 1: The only reachable integer is 
// 2
// +
// 2
// =
// 4
// 2+2=4.

// Example case 2: 
// 4
// 4, 
// 5
// 5 and 
// 6
// 6 are reachable, since 
// 2
// +
// 2
// =
// 4
// 2+2=4, 
// 2
// +
// 3
// =
// 5
// 2+3=5 and 
// 3
// +
// 3
// =
// 6
// 3+3=6.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		int t=Integer.parseInt(br.readLine());
		while(t!=0)
		{
		    String input = br.readLine();
		    String i[]=input.split(" ");
		    int l=Integer.parseInt(i[0]),
		        r=Integer.parseInt(i[1]);
		    int ans = r*2 - l*2 + 1;
		    //All the numbers in the range [l+l, r+r] are reachable
		    //On adding the adjacent numbers we get the odd members
		    //And on adding the same (non-distinct) no.s we get even part
            System.out.println(ans);
		    t--;
		}
	}
}

//input
// 2
// 2 2
// 2 3

//output
// 1
// 3