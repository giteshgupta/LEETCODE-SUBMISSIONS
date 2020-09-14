class Solution {
    public boolean isPalindrome(ListNode head) 
        
        {
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            slow=reverse(slow);
            fast=head;
            
            while(slow!=null)
            {
                if(slow.val!=fast.val)
                {
                    return false;
                }
              slow=slow.next;
                fast=fast.next;
            }
        
        return true;
    }
        
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head, prev=null;
        while(curr!=null)
        {
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
}