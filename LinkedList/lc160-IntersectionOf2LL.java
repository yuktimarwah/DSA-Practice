public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        int lenA = 0;
        while (currA != null) {
            lenA++;
            currA = currA.next;
        }

        int lenB = 0;
        while (currB != null) {
            lenB++;
            currB = currB.next;
        }

        currA = headA;
        currB = headB;

        if (lenB > lenA) {
            int mov = lenB - lenA;
            for (int i = 0; i < mov; i++) {
                currB = currB.next;
            }
        }

        if (lenA > lenB) {
            int mov = lenA - lenB;
            for (int i = 0; i < mov; i++) {
                currA = currA.next;
            }
        }

        while (currA != null) {
            if (currA == currB) {
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;

    }
}
