class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t)
    {
        if(s==null) return false;
        if(t==null) return true;
        
        
        if(areIdentical(s,t)) return true;
        
        return (isSubtree(s.left,t)|| isSubtree(s.right,t));
        
    }
    public boolean areIdentical(TreeNode root1, TreeNode root2)
    {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        
        return (root1.val==root2.val &&
        areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right));
    }
}