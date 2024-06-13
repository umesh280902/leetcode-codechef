// Distinct Substring
// A binary string is a string consisting of 
// 0
// 0 and 
// 1
// 1. We define an island as a substring consisting of all 
// 0
// 0s bounded by 
// 1
// 1s (or the ends of the string).
// For example, in the string 
// 100010000
// 100010000, there are 
// 2
// 2 islands; 
// 000
// 000 (bounded by 
// 1
// 1s) and 
// 0000
// 0000 (bounded by 
// 1
// 1 and end of string). Note that the substring 
// 00
// 00 in the above string is not an island.

// You are given positive integers 
// 𝑁
// N and 
// 𝐾
// K. Find whether there exists a binary string of length 
// 𝑁
// N such that:

// There are exactly 
// 𝐾
// K islands in the string;
// Each island has a distinct length.
// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of two space-separated integers 
// 𝑁
// N and 
// 𝐾
// K — the length of binary string and the required number of islands.
// Output Format
// For each test case, output on a new line, YES if there exist valid binary string, otherwise print NO.

// You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

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
// ≤
// 1
// 0
// 5
// 1≤N≤10 
// 5
 
// 1
// ≤
// 𝐾
// ≤
// 500
// 1≤K≤500
// The sum of 
// 𝑁
// N over all test cases won't exceed 
// 2
// ⋅
// 1
// 0
// 6
// 2⋅10 
// 6
//  .
// Sample 1:
// Input
// Output
// 4
// 1 1
// 3 1
// 6 3
// 7 2
// YES
// YES
// NO
// YES
// Explanation:
// Test case 
// 1
// 1: The only binary string satisfying the conditions is 
// 0
// 0 as it has length 
// 1
// 1 and contains one island, i.e. 
// 0
// 0 itself.

// Test case 
// 2
// 2: Consider the binary string 
// 001
// 001 of length 
// 3
// 3. The only island in this string is 
// 00
// 00.
// Some other valid binary strings under conditions are 
// 000
// ,
// 101
// ,
// 000,101, and 
// 110
// 110. The strings 
// 111
// ,
// 010
// 111,010 are not valid.

// Test case 
// 3
// 3: It is not possible to generate a binary string under given conditions.

// Test case 
// 4
// 4: Consider the binary string 
// 1011000
// 1011000 of length 
// 7
// 7. There are exactly two islands with lengths 
// 1
// 1 and 
// 3
// 3.

// Note that strings like 
// 0001000
// ,
// 1010010
// 0001000,1010010 are not valid.
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    System.out.println(isValid(N, K) ? "YES" : "NO");
		}
		sc.close();
	}
	public static boolean isValid(int N, int K){
	    int minLength = K * (K+1)/2;
	    if (minLength > N) return false;
        int minSeparators = K - 1;
        int totalMinRequiredLength = minLength + minSeparators;
        return totalMinRequiredLength <= N;
	}
}

// Input
// 4
// 1 1
// 3 1
// 6 3
// 7 2
// Output
// YES
// YES
// NO
// YES