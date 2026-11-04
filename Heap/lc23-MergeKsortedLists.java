class Solution {
    public ListNode merge2sorted(ListNode left,ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        ListNode t1=left;
        ListNode t2=right;
        while(t1!=null&&t2!=null){
            if(t1.val<=t2.val){
                t.next = t1;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t2=t2.next;
            }
            t=t.next;
        }
        if(t1!=null){
            t.next=t1;
        }
        if(t2!=null){
            t.next=t2;
        }
        return dummy.next;
    }
    public ListNode helper(ListNode[] lists,int low,int high){
        if(low==high){
            return lists[high];
        }
        int mid = (high+low)/2;
        ListNode left = helper(lists,low,mid);
        ListNode right = helper(lists,mid+1,high);
        return merge2sorted(left,right);

    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length>0){
        return helper(lists,0,lists.length-1);
        }
        else{
            return null;
        }
    }
}
