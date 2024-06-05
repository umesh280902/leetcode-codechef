// Election Hopes
// The elections in Chefland have concluded, and the results are in!

// Chef received 
// 𝑋
// X votes, and his rival Chefu received 
// 𝑌
// Y.

// Chef thinks he dominated the election if and only if he received at least double the number of votes Chefu received.
// Did Chef dominate the election?

// Input Format
// The only line of input contains two space-separated integers 
// 𝑋
// X and 
// 𝑌
// Y — the number of votes received by Chef and Chefu, respectively.
// Output Format
// Print a single line containing the answer: either "Yes" or "No" (without quotes), depending on whether Chef dominated the election or not.

// Each letter of the output may be printed in either uppercase or lowercase, i.e, the strings No, no, NO, and nO will all be treated as equivalent.

// Constraints
// 1
// ≤
// 𝑋
// ,
// 𝑌
// ≤
// 100
// 1≤X,Y≤100
// Sample 1:
// Input
// Output
// 79 40
// No
// Explanation:
// Chef received 
// 79
// 79 votes, and Chefu received 
// 40
// 40.
// Twice of 
// 40
// 40 is 
// 80
// 80, and since Chef didn't receive 
// ≥
// 80
// ≥80 votes, he didn't dominate the election.

// Sample 2:
// Input
// Output
// 28 14
// Yes
// Explanation:
// Chef received 
// 28
// 28 votes, and Chefu received 
// 14
// 14.
// Twice of 
// 14
// 14 is 
// 28
// 28, and since Chef received 
// ≥
// 28
// ≥28 votes, he dominated the election.

// accepted
// Accepted
// 18378
// total-Submissions
// Submissions
// 29163
// accuracy
// Accuracy
// 70.89
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>=y*2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}
