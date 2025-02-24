class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head=null, tail=null;
         if(l1.val<=l2.val)
         {
             head=tail=l1;
             l1=l1.next;
         }
        else
        {
            head=tail=l2;
            l2=l2.next;
        }
        while(l1!=null && l2!=null) // vahan tak jahan tak lenght same hai
        {
            if(l1.val<=l2.val)
            {
                tail.next=l1;  tail=l1; l1=l1.next;       
            }
            else
            {
                tail.next=l2 ; tail=l2; l2=l2.next;
            }
        }
        if(l1==null) tail.next=l2;
        else tail.next=l1;
        
        return head;
    }
}