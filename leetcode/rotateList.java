// 61. Rotate List
// Medium
// Topics
// Companies
// Given the head of a linked list, rotate the list to the right by k places.

 

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:


// Input: head = [0,1,2], k = 4
// Output: [2,0,1]
 

// Constraints:

// The number of nodes in the list is in the range [0, 500].
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 109
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
class rotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode current=head;
        int length=1;
        while(current.next!=null){
            current=current.next;
            length++;
        }
        current.next=head;
        k=k%length;
        int moveHead=length-k;
        ListNode newTail=current;
        while(moveHead-->0){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}


//approach here is that 
/*
 * step 1: calculate the length;
 * step 2: set the next of current node to head;
 * step 3: calculate effective k
 * step 4: rotate till all the heads are moved
 * step 5: return new List
 * 
 */