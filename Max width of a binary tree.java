class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
         int res=0;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
       
        while(!q.isEmpty())    // This is fundamental code for level order traversing 
        {
            int count=q.size();
            res=Math.max(res,count);
            
           for(int i=0;i<count;i++)
            {
                TreeNode curr=q.poll();
               
               if(curr.left!=null)
                    q.add(curr.left);
              if(curr.right!=null)
                    q.add(curr.right);
                
            }
        }
        return res;
    }
}