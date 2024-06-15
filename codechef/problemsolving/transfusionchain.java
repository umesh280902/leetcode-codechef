// Transfusion Chain
// In living donation, the following blood types are compatible:

// Blood type A donors can donate to recipients with blood types A and AB.
// Blood type B donors can donate to recipients with blood types B and AB.
// Blood type AB donors can donate to recipients with blood type AB only.
// Blood type O donors can donate to recipients with blood types A, B, AB and O.
// There are 
// 𝑁
// N people in a hospital where the blood type of the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   person is denoted by 
// 𝐵
// 𝑖
// B 
// i
// ​
//  . Note that the value of 
// 𝐵
// 𝑖
// B 
// i
// ​
//   can be A, B, AB, or O only.

// A chain is formed when a donor can donate blood to a recipient, who in turn can donate blood to another recipient, and so on.

// Find the maximum number of people that can form a chain of blood transfusions.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains an integer 
// 𝑁
// N — the number of people.
// The next line contains 
// 𝑁
// N space separated strings 
// 𝐵
// 𝑖
// B 
// i
// ​
//   — denoting the blood group of each person.
// Output Format
// For each test case, output on a new line, the maximum number of people that can form a chain of blood transfusions.

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
// 1
// 0
// 5
// 1≤N≤10 
// 5
 
// 𝐵
// 𝑖
// ∈
// {
// 𝐴
// ,
// 𝐵
// ,
// 𝐴
// 𝐵
// ,
// 𝑂
// }
// B 
// i
// ​
//  ∈{A,B,AB,O}.
// The sum of 
// 𝑁
// N over all test cases won't exceed 
// 2
// ⋅
// 1
// 0
// 5
// 2⋅10 
// 5
//  .
// Sample 1:
// Explanation:
// Test case 
// 1
// 1: Person 
// 1
// 1 can donate to person 
// 3
// 3. Thus, a chain of 
// 2
// 2 people is formed.

// Test case 
// 2
// 2: Neither person can donate blood to the other. Thus, there is a single person in the chain.

// Test case 
// 3
// 3: Consider the chain 
// 3
// →
// 2
// →
// 4
// 3→2→4. Here, person 
// 3
// 3 can donate to person 
// 2
// 2, and person 
// 2
// 2 can donate to person 
// 4
// 4. Thus, a chain of 
// 3
// 3 people can be formed.

// Test case 
// 4
// 4: The chain 
// 2
// →
// 3
// →
// 5
// →
// 1
// →
// 4
// 2→3→5→1→4 of 
// 5
// 5 people is possible for blood transfusions.

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
		int t = sc.nextInt();
		while(t-->0)
		{
		    //ArrayList<String> arr[] = new ArrayList[4];
		    int n = sc.nextInt();
		    int A = 0;
		    int B = 0;
		    int AB = 0;
		    int O = 0;
		    for(int i=0;i<n;i++)
		    {
		        String str = sc.next();
		        if(str.equals("AB"))
		        {
		            AB++;
		        }
		        else if(str.equals("A"))
		        {
		            A++;
		        }
		        else if(str.equals("B"))
		        {
		            B++;
		        }
		        else
		        {
		            O++;
		        }
		    }
		    if(O > 0)
		    {
		        int max = O + Math.max(A,B) + AB;
		        System.out.println(max);
		    }
		    else if(AB > 0)
		    {
		        int max = AB + Math.max(A,B);
		        System.out.println(max);
		    }
		    else
		    {
		        int max = Math.max(A,B);
		        System.out.println(max);
		    }
		}
	}
}

// Input
// 4
// 3
// A B A
// 2
// A B
// 4
// A B O B
// 5
// AB A A AB A

// Output
// 2
// 1
// 3
// 5