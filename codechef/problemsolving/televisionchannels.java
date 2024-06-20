// Television Channels
// You have a television which had 
// 𝑋
// X working channels numbered 
// 1
// ,
// 2
// ,
// .
// .
// .
// ,
// 𝑋
// 1,2,...,X. Unfortunately, due to a recent change, all even-numbered channels stopped working.

// For example if 
// 𝑋
// =
// 5
// X=5, channels numbered 
// 2
// 2 and 
// 4
// 4 have stopped working, while channels numbered 
// 1
// 1, 
// 3
// 3 and 
// 5
// 5 are still working.

// Given 
// 𝑋
// X, can you tell how many channels are still working?

// Input Format
// The first and only line of input contains a single integer 
// 𝑋
// X.
// Output Format
// Output the number of working channels.

// Constraints
// 1
// ≤
// 𝑋
// ≤
// 100
// 1≤X≤100
// Sample 1:
// Explanation:
// As explained in the statement, channels 
// 1
// 1, 
// 3
// 3 and 
// 5
// 5 are still working, but channels 
// 2
// 2 and 
// 4
// 4 are not. Thus, the answer is 
// 3
// 3.

// Sample 2:
// Explanation:
// Channels 
// 1
// 1, 
// 3
// 3, 
// 5
// 5, 
// 7
// 7, ..., 
// 99
// 99 are still working. Carefully counting them, we know there are exactly 
// 50
// 50 working channels.
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println((int)Math.ceil(x/2.0));
    }
}
// Input
// 5
// Output
// 3

// Input
// 100
// Output
// 50