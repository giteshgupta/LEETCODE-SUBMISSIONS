class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       // if(head==null || head.next==null) return null;
        
          ListNode slow=head;
        ListNode fast=head;
        
        for(int i=0;i<=n;i++)
        {
            if(fast==null) return head.next;
            fast=fast.next;
        }
        while(fast!=null)  //isiliye yahn tak taki slow bhi to next hooooo
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}