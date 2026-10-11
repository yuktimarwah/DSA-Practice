class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;
        
        while (h1 != null || h2 != null || carry != 0) {
            int sum = carry;
            if (h1 != null) {
            sum += h1.val;
            h1 = h1.next;
            }
            if (h2 != null) {
                sum += h2.val;
                h2 = h2.next;
            }
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            curr.next = newNode;
            curr = curr.next;
        }
        return dummy.next;
    }
}
