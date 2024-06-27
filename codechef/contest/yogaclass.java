// Yoga Class
// On the occasion of Yoga Day, the only yoga instructor in Chefland, Chef, has received numerous queries.
// Chef has managed to free up 
// 𝑁
// N hours from his busy schedule to conduct yoga sessions. There are two types of sessions that Chef offers:

// Type 
// 1
// 1 session, which lasts 
// 1
// 1 hour, and earns Chef 
// 𝑋
// X rupees.
// Type 
// 2
// 2 session, which lasts 
// 2
// 2 hours, and earns Chef 
// 𝑌
 
// (
// 𝑌
// >
// 𝑋
// )
// Y (Y>X) rupees.
// Find the maximum amount of money Chef can earn in 
// 𝑁
// N hours.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of three space-separated integers 
// 𝑁
// ,
// 𝑋
// ,
// 𝑌
// N,X,Y — the number of hours for which Chef will take yoga sessions, price of type 
// 1
// 1 session, and price of type 
// 2
// 2 session respectively.
// Output Format
// For each test case, output on a new line, the maximum amount of money Chef can earn in 
// 𝑁
// N hours.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 1000
// 1≤T≤1000
// 1
// ≤
// 𝑁
// ≤
// 1000
// 1≤N≤1000
// 1
// ≤
// 𝑋
// <
// 𝑌
// ≤
// 100
// 1≤X<Y≤100
// Sample 1:
// Explanation:
// Test case 
// 1
// 1: Chef will take type 
// 1
// 1 sessions for all 
// 4
// 4 hours. Thus, in 
// 4
// 4 hours, he can take 
// 4
// 4 sessions earning a total of 
// 4
// ⋅
// 5
// =
// 20
// 4⋅5=20 rupees.

// Test case 
// 2
// 2: Chef will take one session of type 
// 1
// 1 and one session of type 
// 2
// 2. Thus, in 
// 3
// 3 hours, he earns a total of 
// 1
// ⋅
// 1
// +
// 1
// ⋅
// 2
// =
// 3
// 1⋅1+1⋅2=3 rupees.

// Test case 
// 3
// 3: Chef will take one session of type 
// 1
// 1 and two sessions of type 
// 2
// 2. Thus, in 
// 5
// 5 hours, he earns a total of 
// 1
// ⋅
// 2
// +
// 2
// ⋅
// 6
// =
// 14
// 1⋅2+2⋅6=14 rupees.
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0){
		    int N=sc.nextInt();
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    
		    int type2Session=N/2;
		    int type1Session=N%2;
		    
		    int maxAmountOption1=type2Session*Y+type1Session*X;
		    int maxAmountOption2 = N * X;
		    int maxAmount=Math.max(maxAmountOption1,maxAmountOption2);
		    System.out.println(maxAmount);
		    
		} 

	}
}


// Input
// 3
// 4 5 7
// 3 1 2
// 5 2 6
// Output
// 20
// 3
// 14