// 38. Count and Say
// Solved
// Medium
// Topics
// Companies
// Hint
// The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

// countAndSay(1) = "1"
// countAndSay(n) is the run-length encoding of countAndSay(n - 1).
// Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15" and replace "1" with "11". Thus the compressed string becomes "23321511".

// Given a positive integer n, return the nth element of the count-and-say sequence.

// Example 1:

// Input: n = 4

// Output: "1211"

// Explanation:

// countAndSay(1) = "1"
// countAndSay(2) = RLE of "1" = "11"
// countAndSay(3) = RLE of "11" = "21"
// countAndSay(4) = RLE of "21" = "1211"
// Example 2:

// Input: n = 1

// Output: "1"

// Explanation:

// This is the base case.

// Constraints:

// 1 <= n <= 30

public class countandsay {
    class Solution {
        public String countAndSay(int n) {
            if (n == 1) {
                return "1";
            }
            String s = countAndSay(n - 1);
            int count = 0;
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                count++;
                if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                    ans.append(count).append(s.charAt(i));
                    count = 0;
                }
            }
            return ans.toString();

        }
    }
}
