// There is a grid of size 
// 1
// 0
// 5
// ×
// 1
// 0
// 5
// 10 
// 5
//  ×10 
// 5
//  , covered completely in railway tracks. Tom is riding in a train, currently in cell 
// (
// 𝑎
// ,
// 𝑏
// )
// (a,b), and Jerry is tied up in a different cell 
// (
// 𝑐
// ,
// 𝑑
// )
// (c,d), unable to move. The train has no breaks. It shall move exactly 
// 𝐾
// K steps, and then its fuel will run out and it shall stop. In one step, the train must move to one of its neighboring cells, sharing a side. Tom can’t move without the train, as the grid is covered in tracks. Can Tom reach Jerry’s cell after exactly 
// 𝐾
// K steps?

// Note: Tom can go back to the same cell multiple times.

// Input Format
// The first line contains an integer 
// 𝑇
// T, the number of test cases. Then the test cases follow.
// Each test case contains a single line of input, five integers 
// 𝑎
// ,
// 𝑏
// ,
// 𝑐
// ,
// 𝑑
// ,
// 𝐾
// a,b,c,d,K.
// Output Format
// For each testcase, output in a single line "YES" if Tom can reach Jerry's cell in exactly 
// 𝐾
// K moves and "NO" if not.

// You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

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
 
// 0
// ≤
// 𝑎
// ,
// 𝑏
// ,
// 𝑐
// ,
// 𝑑
// ≤
// 1
// 0
// 5
// 0≤a,b,c,d≤10 
// 5
 
// (
// 𝑎
// ,
// 𝑏
// )
// ≠
// (
// 𝑐
// ,
// 𝑑
// )
// (a,b)=(c,d)
// 1
// ≤
// 𝐾
// ≤
// 2
// ⋅
// 1
// 0
// 5
// 1≤K≤2⋅10 
// 5
 
// Subtasks
// Subtask #1 (100 points): original constraints

// Sample 1:
// Input
// Output
// 3
// 1 1 2 2 2
// 1 1 2 3 4
// 1 1 1 0 3
// YES
// NO
// YES
// Explanation:
// Test Case 
// 1
// 1: A possible sequence of moves is 
// (
// 1
// ,
// 1
// )
// →
// (
// 1
// ,
// 2
// )
// →
// (
// 2
// ,
// 2
// )
// (1,1)→(1,2)→(2,2).

// Test Case 
// 2
// 2: There is a possible sequence in 
// 3
// 3 moves, but not in exactly 
// 4
// 4 moves.

// Test Case 
// 3
// 3: A possible sequence of moves is 
// (
// 1
// ,
// 1
// )
// →
// (
// 1
// ,
// 0
// )
// →
// (
// 0
// ,
// 0
// )
// →
// (
// 1
// ,
// 0
// )
// (1,1)→(1,0)→(0,0)→(1,0).

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int k=sc.nextInt();
		    int j=Math.abs(a-c)+Math.abs(b-d);
		    if(k>=j){
		    if((k-j)%2==0){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		}
		
	}
}

//Input
// 3
// 1 1 2 2 2
// 1 1 2 3 4
// 1 1 1 0 3
//Output
// YES
// NO
// YES