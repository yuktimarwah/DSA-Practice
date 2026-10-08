public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode h1 = head;
                
                while (h1 != slow) {
                    slow = slow.next;
                    h1 = h1.next;
                }
                return h1;
            }
        }
        return null;
    }
}
