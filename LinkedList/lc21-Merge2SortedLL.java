class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        
        ListNode dummy = new ListNode(0);
        ListNode newlist = dummy;

        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                newlist.next = curr1;
                curr1 = curr1.next;
            }
            else {
                newlist.next = curr2;
                curr2 = curr2.next;
            }
            newlist = newlist.next;
        }

        if (curr1 != null) {
            newlist.next = curr1;
        }
        if (curr2 != null) {
            newlist.next = curr2;
        }

        return dummy.next;
    }
}
