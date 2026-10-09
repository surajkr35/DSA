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
    public void reorderList(ListNode head) {
        int n = 0;
        Stack<ListNode> stack = new Stack<>();

        ListNode curr = head;

        while(curr != null){
            n++;
            stack.push(curr);
            curr = curr.next;
        }

        curr = head;
        for(int i = 0; i < n / 2; i++){
            ListNode next = curr.next;
            curr.next = stack.pop();
            curr.next.next = next;
            curr = next;
        }
        curr.next = null;
    }
}