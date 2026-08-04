class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right)
            return head;

        ListNode temp1 = head;
        ListNode temp2;
        ListNode start;
        ListNode end = head;

        if (left != 1) {
            for (int i = 0; i < left - 2; i++) {
                temp1 = temp1.next;
            }
            start = temp1.next;
        } else {
            start = head;
        }

        for (int i = 0; i < right - 1; i++) {
            end = end.next;
        }

        temp2 = end.next;

        ListNode prev = start;
        ListNode curr = start.next;

        while (curr != temp2) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        if (left == 1)
            head = prev;
        else
            temp1.next = prev;

        start.next = temp2;

        return head;
    }
}
