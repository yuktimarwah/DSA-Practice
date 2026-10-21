class Solution {
    public ListNode reverse(ListNode head, int revNo) {
        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i < revNo; i++) {
            ListNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode rev = dummy;
        for (int i = 0; i < left - 1; i++) {
            rev = rev.next;
        }

        ListNode afterRev = head;
        for (int i = 1; i <= right; i++) {
            afterRev = afterRev.next;
        }

        ListNode revtail = rev.next;
        int revNo = right - left + 1;
        rev.next = reverse(rev.next,revNo);

        
        revtail.next = afterRev;

        return dummy.next;
    }
}
