class Solution {
    public TreeNode build(ListNode head){
        if(head==null) return null;
        if(head.next==null){
            TreeNode root = new TreeNode(head.val);
            return root;
        }
        ListNode fast=head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast.next!=null&&fast.next.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(prev!=null) prev.next=null;
        TreeNode root = new TreeNode(slow.val);
        if(slow==head){
            root.left = null;
        }
        else{
        root.left = build(head);
        }
        root.right = build(slow.next);
        return root; 
        }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return build(head);
    }
}
