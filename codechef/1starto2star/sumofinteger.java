// You are given an integer 
// 𝑁
// N. Consider the sequence containing the integers 
// 1
// ,
// 2
// ,
// …
// ,
// 𝑁
// 1,2,…,N in increasing order (each exactly once). Find the maximum length of its contiguous subsequence with an even sum.

// Input Format
// The first line of the input contains a single integer 
// 𝑇
// T denoting the number of test cases. The description of 
// 𝑇
// T test cases follows.
// The first and only line of each test case contains a single integer 
// 𝑁
// N.
// Output Format
// For each test case, print a single line containing one integer --- the maximum length of a contiguous subsequence with even sum.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 1
// 0
// 4
// 1≤T≤10 
// 4
 
// 1
// ≤
// 𝑁
// ≤
// 1
// 0
// 4
// 1≤N≤10 
// 4
 
// Subtasks
// Subtask #1 (100 points): original constraints

// Sample 1:
// Input
// Output
// 3
// 3
// 4
// 5
// 3
// 4
// 4
// Explanation:
// Example case 1: The optimal choice is to choose the entire sequence, since the sum of all its elements is 
// 1
// +
// 2
// +
// 3
// =
// 6
// 1+2+3=6, which is even.

// Example case 3: One of the optimal choices is to choose the subsequence 
// [
// 1
// ,
// 2
// ,
// 3
// ,
// 4
// ]
// [1,2,3,4], which has an even sum.
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
		
		while(t-- > 0 ){
		    
		    int n = sc.nextInt();
            
            int sum = n * ( n + 1 ) /2;
            
            if( (sum&1) == 0 ){
                System.out.println( n );
            }
            else{
                System.out.println( n - 1 );
            }
		    
		}
	}
}
//Input
// 3
// 3
// 4
// 5

//output
// 3
// 4
// 4