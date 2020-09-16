class Solution {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calculate(root);
        return res;    
    }
    public int calculate(TreeNode root)
    {      
        if(root==null)
        {
            return 0;
        }
        else
        {
            int l=Math.max(calculate(root.left),0);
            int r=Math.max(calculate(root.right),0);
            
            res=Math.max(res,l+r+root.val);
        
            return Math.max(Math.max(l,r)+root.val, root.val);
        }
    }
}