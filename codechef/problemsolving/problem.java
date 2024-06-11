// Problem
// One less problem without ya
// I got one less problem without ya

// Alice and Bob are competing in a challenge. Initially Alice has 
// 𝑁
// N problems and Bob has 
// 𝑀
// M problems.

// Each time Alice solves a problem, Bob receives one more problem to solve.
// Each time Bob solves a problem, Alice receives three more problems to solve.
// Find whether it is possible that both of them have the same number of problems left if they can solve the problems in any arbitrary manner.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case contains two space-separated integers 
// 𝑁
// N and 
// 𝑀
// M — the initial number of problems of Alice and Bob respectively.
// Output Format
// For each test case, output on a new line, YES, it is possible that both of them have the same number of problems left if they can solve the problems in any arbitrary manner and NO otherwise.

// Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

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
// ,
// 𝑀
// ≤
// 100
// 1≤N,M≤100
// Sample 1:
// Input
// Output
// 4
// 4 2
// 1 5
// 2 3
// 2 2
// YES
// YES
// NO
// YES
// Explanation:
// Test case 
// 1
// 1: Initially Alice has 
// 4
// 4 problems while Bob has 
// 2
// 2 problems.
// Alice can solve a problem first. Thus, Alice now has 
// 4
// −
// 1
// =
// 3
// 4−1=3 problems left and Bob has 
// 2
// +
// 1
// =
// 3
// 2+1=3 problems left.

// Thus, both of them can have same number of problems left.

// Test case 
// 2
// 2: Initially Alice has 
// 1
// 1 problem while Bob has 
// 5
// 5 problems.
// Bob can solve a problem first. Thus, Bob now has 
// 5
// −
// 1
// =
// 4
// 5−1=4 problems left and Alice has 
// 1
// +
// 3
// =
// 4
// 1+3=4 problems left.

// Thus, both of them can have same number of problems left.

// Test case 
// 3
// 3: It can be proven that they cannot have the same number of problems left.

// Test case 
// 4
// 4: Both of them have the same number of problems initially.

// Did you like the problem statement?
// 114 users found this helpful
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner read = new Scanner(System.in);
	    int t = read.nextInt();
	    for(int i=0; i<t; i++){
	        int n = read.nextInt();
	        int m = read.nextInt();
	        int x = Math.abs(n-m);
	        if(x%2==0 || x%4==0){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
	}
}

//Input
// 4
// 4 2
// 1 5
// 2 3
// 2 2

//Output
// YES
// YES
// NO
// YES