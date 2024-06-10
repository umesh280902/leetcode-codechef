// 7 Rings
// In Chefland, a valid phone number consists of 
// 5
// 5 digits with no leading zeros.
// For example, 
// 98765
// ,
// 10000
// ,
// 98765,10000, and 
// 71023
// 71023 are valid phone numbers while 
// 04123
// ,
// 9231
// ,
// 04123,9231, and 
// 872310
// 872310 are not.

// Chef went to a store and purchased 
// 𝑁
// N items, where the cost of each item is 
// 𝑋
// X.
// Find whether the total bill is equivalent to a valid phone number.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of two space-separated integers 
// 𝑁
// N and 
// 𝑋
// X — the number of items Chef bought and the cost per item.
// Output Format
// For each test case, output on a new line, YES, if the total bill is equivalent to a valid phone number and NO otherwise.

// Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 100
// 1≤T≤100
// 1
// ≤
// 𝑁
// ,
// 𝑋
// ≤
// 1000
// 1≤N,X≤1000
// Sample 1:
// Input
// Output
// 4
// 25 785
// 402 11
// 100 100
// 333 333
// YES
// NO
// YES
// NO
// Explanation:
// Test case 
// 1
// 1: Chef bought 
// 25
// 25 items, each with cost 
// 785
// 785. The total bill is thus, 
// 25
// ⋅
// 785
// =
// 19625
// 25⋅785=19625. Since the total bill amount is 
// 5
// 5 digits with no leading zeros, it is equivalent to a valid phone number.

// Test case 
// 2
// 2: Chef bought 
// 402
// 402 items, each with cost 
// 11
// 11. The total bill is thus, 
// 402
// ⋅
// 11
// =
// 4422
// 402⋅11=4422. Since the total bill amount is of 
// 4
// 4 digits, it is not equivalent to a valid phone number.

// Test case 
// 3
// 3: Chef bought 
// 100
// 100 items, each with cost 
// 100
// 100. The total bill is thus, 
// 100
// ⋅
// 100
// =
// 10000
// 100⋅100=10000. Since the total bill amount is 
// 5
// 5 digits with no leading zeros, it is equivalent to a valid phone number

// Test case 
// 4
// 4: Chef bought 
// 333
// 333 items, each with cost 
// 333
// 333. The total bill is thus, 
// 333
// ⋅
// 333
// =
// 110889
// 333⋅333=110889. Since the total bill amount is of 
// 6
// 6 digits, it is not equivalent to a valid phone number.
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
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    if((n*x)>=10000 &&(n*x)<=99999)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}