class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(Math.max(p.val,q.val)<root.val)
        {
            return lowestCommonAncestor(root.left,p,q);
        }
        if(Math.min(p.val,q.val)>root.val)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
        else
            return root;
    }
}