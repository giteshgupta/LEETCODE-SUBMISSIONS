/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      /*  if(head==null || head.next==null)  //will increase Auxallary space although prg                                                  // will run.
            return false;
        else
        {
            HashSet<ListNode> hm=new HashSet<ListNode>();
            ListNode curr=head;
            while(curr.next!=null)
            {
                if(hm.contains(curr))
                    return true;
                else
                    hm.add(curr);
                
                curr=curr.next;
            }
        }
        return false;*/
        
        // Another Solution
        if(head==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
                return true;
        }
        return false;
        
    }
}