class Solution {
    int res;
    public int diameterOfBinaryTree(TreeNode root) {
       calculate(root);
        return res;
    }
    public int calculate(TreeNode root)
    {
        if(root==null)
            return 0;
        int l=calculate(root.left);
        int r=calculate(root.right);
        
       res=Math.max(res,l+r); 
        
        return 1+Math.max(l,r);     // temp manlo jisme outer part stored hai   
    }
}