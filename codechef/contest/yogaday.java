// Yoga Day
// Surya Namaskar, also known as Sun Salutation, is a series of 
// 12
// 12 yoga poses performed in a sequence.

// Chef repeats this sequence of yoga poses multiple times during his session.

// Given that Chef has performed 
// 𝑁
// N yoga poses, find the number of rounds of Surya Namaskar he completed during the session.

// Input Format
// The input will contain a single integer 
// 𝑁
// N, denoting the number of yoga poses Chef performed during his session.

// Output Format
// Output the number of rounds of Surya Namaskar Chef completed during the session.

// Constraints
// 1
// ≤
// 𝑁
// ≤
// 100
// 1≤N≤100
// Sample 1:
// Input
// Output
// 55
// 4
// Explanation:
// Chef completed 
// 4
// 4 rounds of Surya Namaskar comprising of 
// 4
// ⋅
// 12
// =
// 48
// 4⋅12=48 yoga poses.
// The fifth round was incomplete since Chef performed only 
// 7
// 7 poses in that round.

// Sample 2:
// Input
// Output
// 11
// 0
// Explanation:
// Chef performed 
// 11
// 11 yoga poses whereas each Surya Namaskar consists of 
// 12
// 12 poses. Thus, he did not complete even 
// 1
// 1 round of Surya Namaskar.

// Sample 3:
// Input
// Output
// 24
// 2
// Explanation:
// Since Chef performed 
// 24
// 24 yoga poses and each Surya Namaskar consists of 
// 12
// 12 poses, he completed 
// 2
// 2 rounds of Surya Namaskar.

    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println(a/12);
    
        }
    }
    