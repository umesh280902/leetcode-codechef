// The One with Russ
// Rachel has a date and tells everyone she is not mad at Ross but doesn't have any feelings for him anymore either. Seeing her date for the first time, everyone notices that he looks exactly like Ross. However, Rachel refuses to believe so.

// Rachel makes a list of 
// 𝑁
// N characteristics and assigns a score to both Ross and Russ for each of the characteristics. Ross' 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   characteristic has a score equal to 
// 𝐴
// 𝑖
// A 
// i
// ​
//   and Russ' 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   characteristic has a score equal to 
// 𝐵
// 𝑖
// B 
// i
// ​
//  . Rachel decides that Russ looks exactly like Ross if the following condition is satisfied for at least 
// 𝑋
// X distinct values of 
// 𝑗
// j, 
// 1
// ≤
// 𝑗
// ≤
// 𝑁
// 1≤j≤N :

// ∣
// 𝐴
// 𝑗
// −
// 𝐵
// 𝑗
// ∣
// ≤
// 𝐾
// ∣A 
// j
// ​
//  −B 
// j
// ​
//  ∣≤K.
// Help Rachel in finding if both are alike.

// Input Format
// First line will contain 
// 𝑇
// T, number of testcases. Then the testcases follow.
// First line for each test case contains three integers 
// 𝑁
// N, 
// 𝑋
// X and 
// 𝐾
// K, denoting the number of characteristics, the minimum number of characteristics and maximum possible score difference.
// Second line for each test case contains 
// 𝑁
// N integers denoting array 
// 𝐴
// A.
// Third line for each test case contains 
// 𝑁
// N integers denoting array 
// 𝐵
// B.
// Output Format
// For each test case print "YES" if they are alike, else print "NO".

// You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 10
// 1≤T≤10
// 1
// ≤
// 𝑁
// ≤
// 1
// 0
// 3
// 1≤N≤10 
// 3
 
// 1
// ≤
// 𝐴
// 𝑖
// ,
// 𝐵
// 𝑖
// ≤
// 1
// 0
// 3
// 1≤A 
// i
// ​
//  ,B 
// i
// ​
//  ≤10 
// 3
 
// 1
// ≤
// 𝑋
// ≤
// 𝑛
// 1≤X≤n
// 0
// ≤
// 𝐾
// ≤
// 1
// 0
// 3
// 0≤K≤10 
// 3
 
// Sample 1:
// Explanation:
// Test case 1: The values of absolute difference between scores of Ross' and Russ' characteristics 
// 1
// 1 and 
// 2
// 2 are 
// 0
// 0 and 
// 1
// 1 respectively, both these values are less than 
// 𝐾
// =
// 2
// K=2. Thus, Ross and Russ are alike.

// Test case 2: The values of absolute difference between the scores of ALL of the Ross' and Russ' characteristics are greater than 
// 3
// 3.
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class theonewithruss {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int k = sc.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int i = 0; i<n; i++){
		        a[i] = sc.nextInt();
		    }
		    for(int i = 0; i<n; i++){
		        b[i] = sc.nextInt();
		    }
		       int count = 0;
		    for(int i = 0; i<n; i++){
		        if(Math.abs(a[i]-b[i])<=k)
		            count++;
		           
		    }
		      if(count>=x){
		          System.out.println("YES");
		      }
		      else
		        System.out.println("NO");
		}
	}
}
    // Input
    // 3
    // 4 2 2
    // 1 7 7 5
    // 1 8 1 2
    // 5 1 3
    // 9 8 7 2 5
    // 5 4 1 8 9
    // 3 3 0
    // 2 3 4
    // 2 3 4
    // Output
    // YES
    // NO
    // YES
