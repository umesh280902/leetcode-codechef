// Distribute Cookies
// Chef is making cookies for 
// 𝑁
// N kids. He wants to give everyone an equal number of cookies. He must give at least 
// 1
// 1 cookie to each kid.

// Chef already has 
// 𝑀
// M cookies.
// He can destroy or make 
// 1
// 1 cookie in 
// 1
// 1 second.

// Find the minimum time after which he can evenly distribute the cookies between all kids.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of a single line of input.
// The first and only line of each test case contains 
// 𝑁
// N and 
// 𝑀
// M - the number of kids and the initial number of cookies.
// Output Format
// For each test case, output on a new line the minimum time such that Chef can evenly distribute all his cookies.

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
// ,
// 𝑀
// ≤
// 1
// 0
// 9
// 1≤N,M≤10 
// 9
 
// Sample 1:
// Explanation:
// Test Case 1 : Chef destroys 
// 2
// 2 cookies to have 
// 15
// 15 cookies total. This takes 
// 2
// 2 seconds. Now, he can distribute all his cookies by giving every kid 
// 3
// 3 cookies each.

// Test Case 2 : Chef makes 
// 2
// 2 cookies to have 
// 20
// 20 cookies total. This takes 
// 2
// 2 seconds again. Now, he can distribute all his cookies by giving every kid 
// 4
// 4 cookies each.

// Test Case 3 : Chef makes 
// 3
// 3 more cookies to have 
// 4
// 4 cookies total, and he gives 
// 1
// 1 each to the 
// 4
// 4 kids. Note that Chef can't destroy 
// 1
// 1 cookie and then evenly distribute, as he needs to give everyone at least 
// 1
// 1 cookie.
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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    if(b<a){
		        System.out.println(a-b);
		    }else if(b%a==0){
		        System.out.println(0);
		    }else{
		        int remainder=b%a;
		        int cookiestoRemove=remainder;
		        int cookiesToAdd=a-remainder;
		        System.out.println(Math.min(cookiesToAdd,cookiestoRemove));
		    }
		}

	}
}


// Input
// Output
// 4
// 5 17
// 5 18
// 4 1
// 2 18
// 2
// 2
// 3
// 0