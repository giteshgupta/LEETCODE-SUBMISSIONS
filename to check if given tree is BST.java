class Solution {
    int prev= Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
       if(root.val<0) return false;
        if(root==null) return true;
        if(isValidBST(root.left)==false) return false;
        if(prev>=root.val) return false;
            prev=root.val;
         return isValidBST(root.right);
        
    }
}