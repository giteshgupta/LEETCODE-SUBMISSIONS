class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        else
        {
            invertTree(root.left);      // post order Traversal
            invertTree(root.right);
            TreeNode temp= root.left;
            root.left=root.right;
            root.right=temp;
        }
        return root;
    }
}