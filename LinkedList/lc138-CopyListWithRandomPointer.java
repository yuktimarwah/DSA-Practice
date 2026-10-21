class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Node dummy = new Node(-1);
        Node newCurr = dummy;

        HashMap<Node,Node> map = new HashMap<>();

        while (curr != null) {
            Node newNode = new Node(curr.val);
            map.put(curr,newNode);
            newCurr.next = newNode;
            newCurr = newCurr.next;
            curr = curr.next;
        }

        curr = head;
        newCurr = dummy.next;

        while (curr != null) {
            newCurr.random = map.get(curr.random);
            newCurr = newCurr.next;
            curr = curr.next;
        }

        return dummy.next;
    }
}
