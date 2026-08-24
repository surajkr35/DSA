    // ~  Recursive Approach

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        if(head.val == val){
            return removeElements(head.next, val);
        }
        else {
            head.next = removeElements(head.next, val);
            return head;
        }
    }
}
//   _________________________________________________________
    // ~  Iterative Approach 

// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         ListNode dummy = new ListNode();
//         dummy.next = head;

//         ListNode prev = dummy;
//         ListNode curr = head;

//         while(curr != null){
//             if(curr.val == val){
//                 prev.next = curr.next;
//             }
//             else {
//                 prev = curr;
//             }

//             curr = curr.next;
//         }

//         return dummy.next;
//     }
// }