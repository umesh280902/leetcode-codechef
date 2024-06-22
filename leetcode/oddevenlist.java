// 328. Odd Even Linked List
// Medium
// Topics
// Companies
// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

// The first node is considered odd, and the second node is even, and so on.

// Note that the relative order inside both the even and odd groups should remain as it was in the input.

// You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

// Example 1:


// Input: head = [1,2,3,4,5]
// Output: [1,3,5,2,4]
// Example 2:


// Input: head = [2,1,3,5,6,4,7]
// Output: [2,3,6,7,1,5,4]
 

// Constraints:

// The number of nodes in the linked list is in the range [0, 104].
// -106 <= Node.val <= 106
public class oddevenlist {
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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
        
    }
} 
}

/*
 * Example 
 * 1-> 2-> 3->4 -> 5-> None
 * step 1 : odd=1 even =2 evenHead=2;
 * step 2: current node odd=3 even=4 odd.next=even.next 
 * Certainly! Let's walk through the example `1 -> 2 -> 3 -> 4 -> 5 -> None` step-by-step to illustrate how the "Odd Even Linked List" algorithm works.

### Initial List
```
1 -> 2 -> 3 -> 4 -> 5 -> None
```

### Step-by-Step Execution

1. **Initialization**:
   - `odd` points to the first node (`1`)
   - `even` points to the second node (`2`)
   - `even_head` also points to the second node (`2`)
   ```
   odd = 1
   even = 2
   even_head = 2
   ```

2. **First Iteration**:
   - **Current state**:
     ```
     odd = 1
     even = 2
     even_head = 2
     ```

   - Reconnect `odd.next` to `even.next` (i.e., `3`):
     ```
     1 -> 3 -> 4 -> 5 -> None
     ```
   - Move the `odd` pointer to `3`:
     ```
     odd = 3
     ```

   - Reconnect `even.next` to `odd.next` (i.e., `4`):
     ```
     2 -> 4 -> 5 -> None
     ```
   - Move the `even` pointer to `4`:
     ```
     even = 4
     ```

   **List state**:
   ```
   odd = 3
   even = 4
   even_head = 2
   List: 1 -> 3 -> 4 -> 5 -> None
           2 -> 4 -> 5 -> None
   ```

3. **Second Iteration**:
   - **Current state**:
     ```
     odd = 3
     even = 4
     even_head = 2
     ```

   - Reconnect `odd.next` to `even.next` (i.e., `5`):
     ```
     1 -> 3 -> 5 -> None
     ```
   - Move the `odd` pointer to `5`:
     ```
     odd = 5
     ```

   - `even.next` points to `None` because there are no more nodes:
     ```
     4 -> None
     ```
   - Move the `even` pointer to `None`:
     ```
     even = None
     ```

   **List state**:
   ```
   odd = 5
   even = None
   even_head = 2
   List: 1 -> 3 -> 5 -> None
           2 -> 4 -> None
   ```

4. **Combining**:
   - Connect the last odd node (`5`) to the head of the even list (`even_head` which is `2`):
     ```
     1 -> 3 -> 5 -> 2 -> 4 -> None
     ```

### Final List
```
1 -> 3 -> 5 -> 2 -> 4 -> None
```
 * 
 */
