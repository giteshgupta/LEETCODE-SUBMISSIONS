class Solution {
    List<Integer> l= new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return l;
        
    }
    public void inorder(TreeNode root)
    {
        if(root!=null)
        { inorder(root.left);
        l.add(root.val);
        inorder(root.right);
        }      
       
        
    }
}