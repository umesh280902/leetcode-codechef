// EVM Hacking
// There are three cities and thus three EVMs. An insider told Chef that his party got 
// 𝐴
// ,
// 𝐵
// ,
// 𝐶
// A,B,C votes respectively in these three cities according to the EVMs. Also, the total number of votes cast are 
// 𝑃
// ,
// 𝑄
// ,
// 𝑅
// P,Q,R respectively for the three cities.

// Chef, being the party leader, can hack at most one EVM so that his party wins. On hacking a particular EVM all the votes cast in that EVM are counted in favor of Chef's party.

// A party must secure strictly more than half of the total number of votes cast in order to be considered the winner. Can Chef achieve his objective of winning by hacking at most one EVM?

// Input Format
// The first line of input contains an integer 
// 𝑇
// T, denoting the number of test cases. The description of 
// 𝑇
// T test cases follows.
// Each test case consists of a single line of input, containing six space-separated integers — in order, 
// 𝐴
// ,
// 𝐵
// ,
// 𝐶
// ,
// 𝑃
// ,
// 𝑄
// ,
// 𝑅
// A,B,C,P,Q,R.
// Output Format
// For each test case, output in a single line the answer — "YES", if Chef can win the election after hacking at most one EVM and "NO" if not.

// You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 5
// ⋅
// 1
// 0
// 3
// 1≤T≤5⋅10 
// 3
 
// 0
// ≤
// 𝐴
// <
// 𝑃
// ≤
// 100
// 0≤A<P≤100
// 0
// ≤
// 𝐵
// <
// 𝑄
// ≤
// 100
// 0≤B<Q≤100
// 0
// ≤
// 𝐶
// <
// 𝑅
// ≤
// 100
// 0≤C<R≤100
// Sample 1:
// Explanation:
// Test case 
// 1
// 1: Chef can hack any EVM, thus getting a total of 
// 3
// +
// 1
// +
// 1
// =
// 5
// 3+1+1=5 votes which is more than 
// 3
// +
// 3
// +
// 3
// 2
// =
// 4.5
// 2
// 3+3+3
// ​
//  =4.5 votes.

// Test case 
// 2
// 2: Only hacking the second EVM works, getting a total of 
// 49
// +
// 100
// +
// 49
// =
// 198
// 49+100+49=198 votes which is more than 
// 50
// +
// 100
// +
// 50
// 2
// =
// 100
// 2
// 50+100+50
// ​
//  =100 votes.

// Test case 
// 3
// 3: None of the EVM's can help Chef in winning the election, since maximum number of votes he can secure by doing so is 
// 1
// +
// 0
// +
// 0
// =
// 1
// 1+0+0=1 which is less than 
// 1
// +
// 1
// +
// 1
// 2
// =
// 1.5
// 2
// 1+1+1
// ​
//  =1.5.
    
//Om Namah Shivayah

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static String evm(int a,int b,int c,int p,int q,int r){
        
        int bar=(p+q+r)/2;
        
        if(a+b+c>bar) return "YES";
        else if(p+b+c>bar) return "YES";
        else if(q+a+c>bar) return "YES";
        else if(a+b+r>bar) return "YES";
        return "NO";
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
		    
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    int P=sc.nextInt();
		    int Q=sc.nextInt();
		    int R=sc.nextInt();
		    
		    System.out.println(evm(A,B,C,P,Q,R));
		}
	}
}
// Input
// 3
// 1 1 1 3 3 3
// 49 1 49 50 100 50
// 0 0 0 1 1 1
// Output
// YES
// YES
// NO
