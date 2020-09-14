public class Solution {
    public ListNode detectCycle(ListNode head) {
       /*   if(head==null || head.next==null)                                                   
            return null;
        else
        {
            HashSet<ListNode> hm=new HashSet<ListNode>();
            ListNode curr=head;
            while(curr.next!=null)
            {
                if(hm.contains(curr))
                    return curr;
                else
                    hm.add(curr);
                
                curr=curr.next;
            }
        }
        return null;*/
        
        if(head==null) return null;
        else
        {
          ListNode slow=head;
            ListNode fast=head;
            
            while(fast.next!=null && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                
                if(slow==fast)
                {
                    ListNode slowcopy=head;
                    while(slow!=slowcopy)
                    {
                        slow=slow.next;
                        slowcopy=slowcopy.next;
                    }
                    return slow;
                }
            }
        }
        return null;
    }
}