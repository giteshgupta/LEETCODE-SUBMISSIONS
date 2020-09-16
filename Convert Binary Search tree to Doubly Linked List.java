ListNode prev=null;           // ye wala previous bs pichli root ka reference rakhega(approach of algo.)
class Solution
{
  public ListNode convertBT(TreeNode root)
{
   if(root==null)
      return null;
   ListNode head= convertBT(root.left);    //  As we r doing inorder traversal so first call made to left part.


   if(prev==null)		          // Now we are processing the current allocated root at each recursive call.
     {
            head=root;
     }
   else
     {
             root.left=prev;              //Note here left and right are just(previous and next pointer we use in LL.)
             prev.right=root;
     }                         
    prev=root;                            // till here we are processing our root part.
    
   convertBT(root.right);                 // Now we are exceuting our right call which is made after processing
                                          //left part and the root respectively.
                                          
   return head;                           // at Last we are returning the head of our Doubly Linked List.
}
}