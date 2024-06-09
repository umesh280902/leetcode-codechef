
// CodeChef Streak
// CodeChef offers a feature called streak count. A streak is maintained if you solve at least one problem daily.

// Om and Addy actively maintain their streaks on CodeChef. Over a span of 
// 𝑁
// N consecutive days, you have observed the count of problems solved by each of them.

// Your task is to determine the maximum streak achieved by Om and Addy and find who had the longer maximum streak.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains an integer 
// 𝑁
// N — the number of days.
// The second line of each test case contains 
// 𝑁
// N space-separated integers, the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   of which is 
// 𝐴
// 𝑖
// A 
// i
// ​
//  , representing the problems solved by Om on the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   day.
// The third line of each test case contains 
// 𝑁
// N space-separated integers, the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   of which is 
// 𝐵
// 𝑖
// B 
// i
// ​
//  , representing the problems solved by Addy on the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   day.
// Output Format
// For each test case, output:

// OM, if Om has longer maximum streak than Addy;
// ADDY, if Addy has longer maximum streak than Om;
// DRAW, if both have equal maximum streak.
// You may print each character in uppercase or lowercase. For example, OM, om, Om, and oM, are all considered the same.

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
// 𝑁
// ≤
// 1
// 0
// 5
// 1≤N≤10 
// 5
 
// 0
// ≤
// 𝐴
// 𝑖
// ,
// 𝐵
// 𝑖
// ≤
// 1
// 0
// 9
// 0≤A 
// i
// ​
//  ,B 
// i
// ​
//  ≤10 
// 9
 
// The sum of 
// 𝑁
// N over all test cases won't exceed 
// 6
// ⋅
// 1
// 0
// 5
// 6⋅10 
// 5
//  .

import java.util.Scanner;

public class codechefstreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int amax = findLongestContiguousNonZeroSequence(a, n);
            int bmax = findLongestContiguousNonZeroSequence(b, n);
            if (amax > bmax) {
                System.out.println("Om");
            } else if (bmax > amax) {
                System.out.println("Addy");
            } else {
                System.out.println("Draw");
            }
        }
    }
    private static int findLongestContiguousNonZeroSequence(int[] arr, int length) {
        int maxCount = 0, count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount) {
            maxCount = count;
        }
        return maxCount;
    }
}

//Input
// 3
// 6
// 1 7 3 0 2 13
// 0 2 3 4 5 0
// 3
// 1 3 4
// 3 1 2
// 5
// 1 2 3 0 1
// 1 2 0 2 3

//Output
// Addy
// Draw
// Om