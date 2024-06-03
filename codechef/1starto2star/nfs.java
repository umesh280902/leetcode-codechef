// Chef is playing Need For Speed. Currently, his car is running on a straight road with a velocity 
// 𝑈
// U metres per second and approaching a 
// 9
// 0
// ∘
// 90 
// ∘
//   turn which is 
// 𝑆
// S metres away from him. To successfully cross the turn, velocity of the car when entering the turn must not exceed 
// 𝑉
// V metres per second.

// The brakes of Chef's car allow him to slow down with a deceleration (negative acceleration) not exceeding 
// 𝐴
// A metres per squared second. Tell him whether he can cross the turn successfully. The velocity 
// 𝑣
// v when entering the turn can be determined from Newton's 2nd law to be 
// 𝑣
// 2
// =
// 𝑈
// 2
// +
// 2
// ⋅
// 𝑎
// ⋅
// 𝑆
// v 
// 2
//  =U 
// 2
//  +2⋅a⋅S if the car is moving with a uniform acceleration 
// 𝑎
// a.

// Input
// The first line of the input contains a single integer 
// 𝑇
// T denoting the number of test cases. The description of 
// 𝑇
// T test cases follows.
// The first and only line of each test case contains four space-separated integers 
// 𝑈
// U, 
// 𝑉
// V, 
// 𝐴
// A and 
// 𝑆
// S.
// Output
// For each test case, print a single line containing the string "Yes" if Chef can cross the turn successfully or "No" if he cannot (without quotes).

// You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

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
// 𝑈
// ,
// 𝑉
// ,
// 𝐴
// ,
// 𝑆
// ≤
// 1
// 0
// 4
// 1≤U,V,A,S≤10 
// 4
 
// Subtasks
// Subtask #1 (100 points): original constraints

// Sample 1:
// Input
// Output
// 3
// 1 1 1 1
// 2 1 1 1
// 2 2 1 1
// Yes
// No
// Yes
// Explanation:
// Example case 1: Since 
// 𝑈
// =
// 𝑉
// =
// 1
// U=V=1, Chef does not need to brake and will be able to turn successfully.

// Example case 2: The smallest velocity Chef's car can have even with the maximum deceleration is 
// 2
// ⋅
// 2
// −
// 2
// ⋅
// 1
// ⋅
// 1
// =
// 2
// 2⋅2−2⋅1⋅1
// ​
//  = 
// 2
// ​
//  , which is greater than the maximum allowed velocity for a safe turn.

// Example case 3: The smallest velocity Chef's car can have with the maximum deceleration is again 
// 2
// 2
// ​
//  , which is smaller than the maximum allowed velocity for a safe turn.
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
		    int u=sc.nextInt();
		    int v=sc.nextInt();
		    int a=sc.nextInt();
		    int s=sc.nextInt();
		    if(Math.pow(v,2)>=Math.pow(u,2)-2*a*s){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		}

	}
}

//Input
// 3
// 1 1 1 1
// 2 1 1 1
// 2 2 1 1

// Yes
// No
// Yes