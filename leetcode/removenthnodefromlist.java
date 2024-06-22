// 19. Remove Nth Node From End of List
// Solved
// Medium
// Topics
// Companies
// Hint
// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
public class removenthnodefromlist {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // Calculate the length of the linked list
            int length = 0;
            ListNode temp = head;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
    
            // Calculate the position to remove from the start
            int pos = length - n;
    
            // If the node to remove is the head node
            if (pos == 0) {
                return head.next;
            }
    
            // Traverse to the node just before the one to remove
            ListNode current = head;
            for (int i = 1; i < pos; i++) {
                current = current.next;
            }
    
            // Remove the nth node from the end
            current.next = current.next.next;
    
            return head;
        }
    }
       
}
