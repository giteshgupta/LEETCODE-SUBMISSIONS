/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
public ListNode sortList(ListNode head) {

        if(head==null || head.next==null) return head;

        PriorityQueue<ListNode> q= new PriorityQueue<ListNode>((a, b) -> a.val - b.val);//comparable types something


        ListNode curr=head;
        while(curr!=null)
        {
            q.add(curr);
            curr=curr.next;
        }
        ListNode helper=new ListNode(0);  // way to create a new list.
        ListNode ptr=helper;
        while(!q.isEmpty())
        {
            ptr.next=q.poll();//isme nodes hain tbi new nhi bnare
            ptr=ptr.next;
        }
      ptr.next=null;
        return helper.next;     
    }
}