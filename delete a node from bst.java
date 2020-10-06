class Solution {
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null) return null;
        
        if(root.val>key)
        {
            root.left=deleteNode(root.left, key);
        }
       else if(root.val<key)
        {
            root.right=deleteNode(root.right, key);
        }
        else   // This entire else is for equal case.
        { 
            if(root.left==null) return root.right;
         
            else if(root.right==null) return root.left;
            
            TreeNode succ= getSucc(root.right);
            root.val=succ.val;
            root.right=deleteNode(root.right,root.val);
        }

            
        
        return root;
    }
    public TreeNode getSucc(TreeNode root)
    {
        TreeNode curr= root;
        while(curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;
    }
}