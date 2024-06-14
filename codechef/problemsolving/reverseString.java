// Reverse String
// Given a sentence. Print the words of a sentence in reverse order.

// ###Input:

// First line will contain a string of words.
// ###Output:

// Modified String
// ###Constraints

// 1
// ≤
// ∣
// 𝑙
// 𝑒
// 𝑛
// 𝑔
// 𝑡
// ℎ
// 𝑜
// 𝑓
// 𝑠
// 𝑡
// 𝑟
// 𝑖
// 𝑛
// 𝑔
// ∣
// ≤
// 500
// 1≤∣lengthofstring∣≤500
// ###Sample Input: cats and dogs

// ###Sample Output: dogs and cats

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
		Scanner s=new Scanner(System.in);
		String p;
		p=s.nextLine();
		String[] t=p.split(" ");
		int l=t.length;
		for(int i=l-1;i>=0;i--){
		    System.out.print(t[i]+" ");
		}
		System.out.println();
	}
}