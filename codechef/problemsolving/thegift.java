// The Gift
// Om has 
// 𝑋
// X rupees. He wants to gift a laptop worth 
// 𝑁
// N rupees to his girlfriend.

// We know that Om is the technical secretary of IIIT-A and has access to the Gymkhana funds of IIIT-A. Currently there are 
// 𝑀
// M rupees in the fund and Om can use the fund as much as he wants.

// Find whether Om can gift his girlfriend a new laptop.

// Input Format
// The first and only line of input contains three space-separated integers 
// 𝑋
// X, 
// 𝑁
// N, and 
// 𝑀
// M — the amount Om has, the price of the laptop, and the amount present in the Gymkhana fund respectively.
// Output Format
// For each input, output YES if Om can buy the laptop and NO otherwise.

// You may print each character in uppercase or lowercase. For example YES, Yes, yes, and yES are all considered the same.

// Constraints
// 1
// ≤
// 𝑋
// ,
// 𝑁
// ,
// 𝑀
// ≤
// 1
// 0
// 3
// 1≤X,N,M≤10 
// 3
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
		int x = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if((x+m) >= n)
		{
		    System.out.println("yes");
		}
		else 
		{
		    System.out.println("no");
		}
	}
}

//Input
//5 10 15
//Output
//YES