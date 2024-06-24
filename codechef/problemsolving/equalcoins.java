// Equal Coins
// Read problem statements in Bengali, Russian, Mandarin and Vietnamese as well.
// Chef has 
// 𝑋
// X coins worth 
// 1
// 1 rupee each and 
// 𝑌
// Y coins worth 
// 2
// 2 rupees each. He wants to distribute all of these 
// 𝑋
// +
// 𝑌
// X+Y coins to his two sons so that the total value of coins received by each of them is the same. Find out whether Chef will be able to do so.

// Input Format
// The first line of input contains a single integer 
// 𝑇
// T, denoting the number of testcases. The description of 
// 𝑇
// T test cases follows.
// Each test case consists of a single line of input containing two space-separated integers 
// 𝑋
// X and 
// 𝑌
// Y.
// Output Format
// For each test case, print "YES" (without quotes) if Chef can distribute all the coins equally and "NO" otherwise. You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 1
// 0
// 3
// 1≤T≤10 
// 3
 
// 0
// ≤
// 𝑋
// ,
// 𝑌
// ≤
// 1
// 0
// 8
// 0≤X,Y≤10 
// 8
 
// 𝑋
// +
// 𝑌
// >
// 0
// X+Y>0
// Subtasks
// Subtask 1 (100 points): Original constraints
// Sample 1:
// Input
// Output
// 4
// 2 2
// 1 3
// 4 0
// 1 10
// YES
// NO
// YES
// NO
// Explanation:
// Test case 
// 1
// 1: Chef gives each of his sons 
// 1
// 1 coin worth one rupee and 
// 1
// 1 coin worth two rupees.

// Test case 
// 3
// 3: Chef gives each of his sons 
// 2
// 2 coins worth one rupee.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int x,y;
		    x=s.nextInt();
		    y=s.nextInt();
		  if((x+2*y)%2!=0 || (y%2!=0 && x<2))
		  {
		      System.out.println("NO");
		  }else{
		      System.out.println("YES");
		  }
		 //   if(x%2!=0||y%2!=0){
		 //       System.out.println("NO");
		 //   }
		 //   else if(x%2!=0&&y%2!=0){
		 //       System.out.println("NO");
		 //   }
		 //   else{
		 //       System.out.println("YES");
		 //   }
		}
	}
}
