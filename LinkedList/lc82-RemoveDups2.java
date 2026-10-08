class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = head;
        ListNode prev = dummy;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
                curr = curr.next;
            }
            else {
                curr = curr.next;
                prev = prev.next;   
            } 
            
        }
        return dummy.next;
    }
}
