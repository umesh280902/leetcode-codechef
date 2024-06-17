// Two Different Palindromes
// You are given two positive integers 
// 𝐴
// A and 
// 𝐵
// B. You need to construct two different binary strings (i.e, they are strings which consist of only 
// 0
// 0s and 
// 1
// 1s), which satisfy these two conditions:

// Both the strings should be palindromes.
// Each string should have exactly 
// 𝐴
// A 
// 0
// 0s, and exactly 
// 𝐵
// B 
// 1
// 1s in them.
// Output Yes if two such different binary strings can be constructed and No otherwise.

// Note:

// A string is said to be a palindrome, if the string and the reverse of the string are identical.
// Two strings are said to be different if either their lengths are different, or if they differ in at least one character.
// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case contains two space-separated integers, 
// 𝐴
// A and 
// 𝐵
// B, in a new line.
// Output Format
// For each test case, output on a new line 'Yes', if you can construct two different binary strings satisfying the conditions. If not, output No.

// You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yes, YES, and YEs will all be treated as identical).

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
// 𝐴
// ,
// 𝐵
// ≤
// 1
// 0
// 6
// 1≤A,B≤10 
// 6
 
// Sample 1:
// Explanation:
// Test case 
// 1
// 1: Consider the binary strings 
// 0110
// 0110 and 
// 1001
// 1001. Both of them are palindromes, and both of them have exactly 
// 2
// 2 
// 0
// 0s, and 
// 2
// 2 
// 1
// 1s. Hence we can construct them, and so the answer is Yes.

// Test case 
// 2
// 2: Consider the binary strings 
// 01110
// 01110 and 
// 10101
// 10101. Both of them are palindromes, and both of them have exactly 
// 2
// 2 
// 0
// 0s, and 
// 3
// 3 
// 1
// 1s. Hence we can construct them, and so the answer is Yes.

// Test case 
// 3
// 3: There is no way to construct two such different strings. Hence the answer is No.
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int A = sc.nextInt();
            int B=sc.nextInt();
            
            if(A == 1 || B == 1){
                System.out.println("No");
            }else if(A % 2 == 0 && B % 2 == 0) System.out.println("Yes");
            else if (A % 2 != 0 && B % 2 != 0) System.out.println("No");
            else System.out.println("Yes");
        }
        
	}
}
// Input
// 3
// 2 2
// 2 3
// 3 3
// Output
// Yes
// Yes
// No
