// 5. Longest Palindromic Substring
// Solved
// Medium
// Topics
// Companies
// Hint
// Given a string s, return the longest 
// palindromic
 
// substring
//  in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"
 

// Constraints:

// 1 <= s.length <= 1000
// s consist of only digits and English letters.
public class longestpalindrome {
    public class Solution {
        public String longestPalindrome(String s) {
            if (s.length() <= 1) {
                return s;
            }
    
            String maxStr = s.substring(0, 1);
    
            for (int i = 0; i < s.length() - 1; i++) {
                String odd = expandFromCenter(s, i, i);
                String even = expandFromCenter(s, i, i + 1);
    
                if (odd.length() > maxStr.length()) {
                    maxStr = odd;
                }
                if (even.length() > maxStr.length()) {
                    maxStr = even;
                }
            }
    
            return maxStr;
        }
    
        private String expandFromCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return s.substring(left + 1, right);
        }
    }
}
