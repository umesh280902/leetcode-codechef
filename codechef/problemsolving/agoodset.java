// Input
// The first line of the input contains an integer T denoting number of test cases. The descriptions of T test cases follow.
// The only line of each test case contains an integer n, denoting the size of the needed good set.
// Output
// For each test case, output a single line containing n integers denoting the elements of the good set, in any order. There can be more than one possible good set, and you can output any one of them.

// Constraints
// 1 ≤ T, n ≤ 100
// Subtasks
// Subtask #1 (50 points): 1 ≤ T, n ≤ 10
// Subtask #2 (50 points): original constraints
// Sample 1:
// Input
// Output
// 5
// 1
// 2
// 3
// 4
// 5
// 7
// 1 2
// 1 2 4
// 1 2 4 16
// 3 2 15 6 10
// Explanation:
// Example 1 and 2. Any set of size less than or equal to 2 is good by definition.

// Example 3 onwards. For each pair of elements in the set, you can see that their sum doesn't exist in the set.
    /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    int sum = 1;
		    for(int i=1; i<=N; i++){
		        System.out.print(sum + " ");
		        sum = sum + 2;
		    }
		    System.out.println();
		    T--;
		}
	}
}
