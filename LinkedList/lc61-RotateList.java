class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        int finalK = k % len;

        if (finalK == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < finalK; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newhead = slow.next;
        

        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        slow.next = null;
        return newhead;
    }
}
