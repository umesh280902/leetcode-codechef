// Make Permutation
// Chef has an array 
// 𝐴
// A of size 
// 𝑁
// N. He wants to make a permutation
// †
// †
//   using this array.

// Find whether there exists an array 
// 𝐵
// B consisting of 
// 𝑁
// N non-negative integers, such that the array 
// 𝐶
// C constructed as 
// 𝐶
// 𝑖
// =
// 𝐴
// 𝑖
// +
// 𝐵
// 𝑖
// C 
// i
// ​
//  =A 
// i
// ​
//  +B 
// i
// ​
//   is a permutation.

// †
// †
//   A permutation of size 
// 𝑁
// N is an array of 
// 𝑁
// N distinct elements in the range 
// [
// 1
// ,
// 𝑁
// ]
// [1,N]. For example, 
// [
// 4
// ,
// 2
// ,
// 1
// ,
// 3
// ]
// [4,2,1,3] is a permutation of size 
// 4
// 4, while 
// [
// 3
// ,
// 2
// ,
// 2
// ,
// 1
// ]
// [3,2,2,1] and 
// [
// 1
// ,
// 3
// ,
// 4
// ]
// [1,3,4] are not.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case consists of 
// 𝑁
// N - the size of the array 
// 𝐴
// A
// The next line contains 
// 𝑁
// N space-separated integers - 
// 𝐴
// 1
// ,
// 𝐴
// 2
// ,
// …
// ,
// 𝐴
// 𝑁
// A 
// 1
// ​
//  ,A 
// 2
// ​
//  ,…,A 
// N
// ​
//   - the elements of array 
// 𝐴
// A.
// Output Format
// For each test case, output YES if there exists an array 
// 𝐵
// B such that array 
// 𝐶
// C constructed as 
// 𝐶
// 𝑖
// =
// 𝐴
// 𝑖
// +
// 𝐵
// 𝑖
// C 
// i
// ​
//  =A 
// i
// ​
//  +B 
// i
// ​
//   is a permutation, otherwise output NO.

// You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

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
// ≤
// 100
// 1≤N≤100
// 1
// ≤
// 𝐴
// 𝑖
// ≤
// 𝑁
// 1≤A 
// i
// ​
//  ≤N
// Sample 1:
// Input
// Output
// 4
// 5
// 4 1 3 2 1
// 5
// 2 4 3 4 2
// 1
// 1
// 6
// 1 1 1 1 6 6
// YES
// NO
// YES
// NO
// Explanation:
// Test case 
// 1
// 1 : Consider 
// 𝐵
// =
// [
// 0
// ,
// 4
// ,
// 0
// ,
// 0
// ,
// 0
// ]
// B=[0,4,0,0,0]. The corresponding array 
// 𝐶
// C becomes 
// [
// 4
// ,
// 5
// ,
// 3
// ,
// 2
// ,
// 1
// ]
// [4,5,3,2,1], which is a permutation. Some other possible values of 
// 𝐵
// B for which 
// 𝐶
// C is a permutation are 
// [
// 1
// ,
// 0
// ,
// 1
// ,
// 1
// ,
// 1
// ]
// [1,0,1,1,1] and 
// [
// 1
// ,
// 3
// ,
// 0
// ,
// 0
// ,
// 0
// ]
// [1,3,0,0,0].

// Test case 
// 2
// 2 : It can be proven that no valid array 
// 𝐵
// B exists.
    import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            Arrays.sort(arr);
            int ans=1;
            for(int i=0;i<n;i++){
                if(arr[i]>i+1){
                    ans=-1;
                    break;
                }
            }
            if(ans==-1){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
	}
}

