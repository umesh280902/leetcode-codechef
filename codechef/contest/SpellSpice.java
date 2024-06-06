// Chef has 
// 𝑁
// N magic spells. The 
// 𝑖
// i-th spell has a volatility of 
// 𝑉
// 𝑖
// V 
// i
// ​
//   and a strength of 
// 𝐴
// 𝑖
// A 
// i
// ​
//  .

// When spells 
// 𝑖
// i and 
// 𝑗
// j (
// 1
// ≤
// 𝑖
// <
// 𝑗
// ≤
// 𝑁
// 1≤i<j≤N) are activated together, they merge to form a single spell of strength 
// (
// 𝐴
// 𝑖
// ×
// 𝑉
// 𝑗
// +
// 𝑉
// 𝑖
// ×
// 𝐴
// 𝑗
// )
// (A 
// i
// ​
//  ×V 
// j
// ​
//  +V 
// i
// ​
//  ×A 
// j
// ​
//  ).

// What's the maximum possible strength of a spell Chef can obtain by activating exactly two of his spells?

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains a single integer 
// 𝑁
// N, the number of spells.
// The next 
// 𝑁
// N lines describe the spells. The 
// 𝑖
// i-th of them contains two space-separated integers 
// 𝑉
// 𝑖
// V 
// i
// ​
//   and 
// 𝐴
// 𝑖
// A 
// i
// ​
//   — the volatility and strength of the 
// 𝑖
// i-th spell.
// Output Format
// For each test case, output on a new line the maximum possible power of a combined spell.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 100
// 1≤T≤100
// 2
// ≤
// 𝑁
// ≤
// 100
// 2≤N≤100
// 1
// ≤
// 𝐴
// 𝑖
// ,
// 𝑉
// 𝑖
// ≤
// 1000
// 1≤A 
// i
// ​
//  ,V 
// i
// ​
//  ≤1000
// Sample 1:
// Input
// Output
// 3
// 2
// 1 10
// 5 5
// 4
// 4 7
// 8 9
// 10 2
// 6 6
// 4
// 35 45
// 5 50
// 50 5
// 45 35
// 55
// 106
// 3250
// Explanation:
// Test case 
// 1
// 1: There are only two spells. Combining them results in a spell of strength 
// 1
// ×
// 5
// +
// 5
// ×
// 10
// =
// 55
// 1×5+5×10=55.

// Test case 
// 2
// 2: It's optimal to choose the second and third spells. Combining them results in a spell of strength 
// 8
// ×
// 2
// +
// 10
// ×
// 9
// =
// 106
// 8×2+10×9=106.

// Test case 
// 3
// 3: It's optimal to choose the first and fourth spells. Combining them results in a spell of strength 
// 45
// ×
// 45
// +
// 35
// ×
// 35
// =
// 3250
// 45×45+35×35=3250.

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
		    int size=sc.nextInt();
		        int v[]=new int[size];
		        int a[]=new int[size];
		        for(int i=0;i<size;i++){
		            v[i]=sc.nextInt();
		            a[i]=sc.nextInt();
		        }
		        int max=Integer.MIN_VALUE;
		        for(int i=0;i<size;i++){
		            for(int j=i+1;j<size;j++){
		                int combStrength=a[i]*v[j]+v[i]*a[j];
		                if(combStrength>max){
		                    max=combStrength;
		                }
		                
		            }
		        }
		        System.out.println(max);
		}

	}
}

//Input
// 3
// 2
// 1 10
// 5 5
// 4
// 4 7
// 8 9
// 10 2
// 6 6
// 4
// 35 45
// 5 50
// 50 5
// 45 35

//Output
// 55
// 106
// 3250