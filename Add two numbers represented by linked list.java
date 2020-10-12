class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=null;
        ListNode head=null;
        ListNode prev=null;
        int sum; int carry=0;
        
        while(l1!=null || l2!=null)
        {
            sum = carry + (l1!=null ? l1.val : 0) + (l2!=null ? l2.val : 0);
            
            if(sum>=10)
            {
                carry=1;
            }
            else
            {
                carry=0;
            }
            sum=sum%10;  // ye sum agr 10 se jada hua tab;
            
            temp =new ListNode(sum);
            
            if(head==null)
            {
                head=temp;
            }
            else
            {
                prev.next=temp;
            }
            prev=temp;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        
        if(carry>0) // incase last digit mai carry bacha to append hojegi
        {
            temp.next =new ListNode(carry);
        }
        return head;
    }
}