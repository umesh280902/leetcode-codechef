// Given the head of a singly linked list, reverse the list, and return the reversed list.

 

// Example 1:


// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// Example 2:


// Input: head = [1,2]
// Output: [2,1]
// Example 3:

// Input: head = []
// Output: []
 

// Constraints:

// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class reverseSinglyList {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        
        // Push all values of the linked list onto the stack
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        
        // Create a new dummy node for the reversed list
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        
        // Pop values from the stack and create new nodes in reversed order
        while (!stack.isEmpty()) {
            current.next = new ListNode(stack.pop());
            current = current.next;
        }
        
        // Return the next of dummy node, which is the head of the reversed list
        return dummy.next;
    }
}
