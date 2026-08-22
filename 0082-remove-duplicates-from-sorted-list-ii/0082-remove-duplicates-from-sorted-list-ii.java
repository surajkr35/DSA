class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        ListNode curr = head;

        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
                int dupVal = curr.val;
                while(curr != null && curr.val == dupVal){
                    curr = curr.next;
                }
            } 
            else {
                tail.next = curr;
                tail = curr;
                curr = curr.next;
            }
        }
        tail.next = null;
        return dummy.next;
    }
}