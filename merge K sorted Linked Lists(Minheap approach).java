class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue <Integer> q =new PriorityQueue <Integer>();
        for(ListNode curr:lists)
        {
         while(curr!=null)
         {
             q.add(curr.val);
             curr=curr.next;
         }
        }
        ListNode copy=new ListNode();
        ListNode head=copy;
        while(!q.isEmpty())
        {
            head.next=new ListNode(q.poll());
            head=head.next;
        }
        return copy.next;
    }
}