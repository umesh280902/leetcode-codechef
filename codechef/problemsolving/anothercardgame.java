// Another Card Game Problem
// Read problem statements in Hindi, Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
// Chef is playing a card game with his friend Rick Sanchez. He recently won against Rick's grandson Morty; however, Rick is not as easy to beat. The rules of this game are as follows:

// The power of a positive integer is the sum of digits of that integer. For example, the power of 
// 13
// 13 is 
// 1
// +
// 3
// =
// 4
// 1+3=4.
// Chef and Rick receive randomly generated positive integers. For each player, let's call the integer he received final power.
// The goal of each player is to generate a positive integer such that its power (defined above) is equal to his final power.
// The player who generated the integer with fewer digits wins the game. If both have the same number of digits, then Rick cheats and wins the game.
// You are given the final power of Chef 
// 𝑃
// 𝐶
// P 
// C
// ​
//   and the final power of Rick 
// 𝑃
// 𝑅
// P 
// R
// ​
//  . Assuming that both players play optimally, find the winner of the game and the number of digits of the integer he generates.

// Input
// The first line of the input contains a single integer 
// 𝑇
// T denoting the number of test cases. The description of 
// 𝑇
// T test cases follows.
// The first and only line of each test case contains two space-separated integers 
// 𝑃
// 𝐶
// P 
// C
// ​
//   and 
// 𝑃
// 𝑅
// P 
// R
// ​
//  .
// Output
// For each test case, print a single line containing two space-separated integers. The first of these integers should be either 
// 0
// 0 if Chef wins or 
// 1
// 1 if Rick wins. The second integer should be the number of digits of the integer generated by the winner.

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
// 𝑃
// 𝐶
// ,
// 𝑃
// 𝑅
// ≤
// 1
// 0
// 6
// 1≤P 
// C
// ​
//  ,P 
// R
// ​
//  ≤10 
// 6
 
// Subtasks
// Subtask #1 (100 points): original constraints

// Sample 1:
// Explanation:
// Example case 1: Chef and Rick generate the optimal integers 
// 3
// 3 and 
// 5
// 5 respectively. Each of them has 
// 1
// 1 digit, so Rick cheats and wins the game.

// Example case 2: Chef and Rick could generate e.g. 
// 6877
// 6877 and 
// 99
// 99 respectively. Since Rick's integer has 
// 2
// 2 digits and Chef cannot generate an integer with less than 
// 4
// 4 digits, Rick wins.

// Example case 3: Chef and Rick could generate e.g. 
// 86
// 86 and 
// 888
// 888 respectively. Chef's integer has 
// 2
// 2 digits and Rick cannot generate an integer with less than 
// 3
// 3 digits, so Chef wins.
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
		    int Pc = sc.nextInt();
		    int Pr = sc.nextInt();
		    
		    int digitC = Pc/9;
		    int digitR = Pr/9;
		    if(digitC == digitR)
		        System.out.println(1 + " " + (Pc%9 == 0 ? digitC : digitC+1));
		    else if(digitC > digitR){
		        System.out.println(1 + " " + (Pr%9 == 0 ? digitR : digitR+1));
		    }else if(digitC < digitR){
		        System.out.println(0 + " " + (Pc%9 == 0 ? digitC : digitC+1));
		    }
		    T--;
		}
	}
}

// Input
// 3
// 3 5
// 28 18
// 14 24
// Output
// 1 1
// 1 2
// 0 2