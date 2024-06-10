// Gymkhana Election IIIT-A
// In the Gymkhana elections of IIIT-A, 
// 𝑁
// N members are nominated for senator positions. The total number of voters in the college is 
// 𝑀
// M.

// Om, one of the 
// 𝑁
// N nominees, wants to secure a strict majority win in the election.

// Assuming all voters cast their votes, find the minimum number of votes Om requires to ensure a strict majority win.

// Note that in a strict majority win, all the nominees have strictly lesser votes than the winner.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of two space-separated integers 
// 𝑁
// N and 
// 𝑀
// M — the number of nominated members and the number of voters respectively.
// Output Format
// For each test case, output the minimum number of votes Om requires to ensure a strict majority win.

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
// 𝑀
// ≤
// 1
// 0
// 9
// 2≤N≤M≤10 
// 9
 
// Sample 1:
// Input
// Output
// 2
// 5 12 
// 4 5 
// 7
// 3
// Explanation:
// Test case 
// 1
// 1: Om has to get a minimum of 
// 7
// 7 votes to ensure a strict majority win. If he gets 
// 7
// 7 votes, it is not possible for any other nominee to get at least 
// 7
// 7 votes.

// Test case 
// 2
// 2: Om has to get a minimum of 
// 3
// 3 votes to ensure a strict majority win. If he gets 
// 3
// 3 votes, it is not possible for any other nominee to get at least 
// 3
// 3 votes.
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
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    
		    System.out.println((M/2)+1);
		}
	}
}