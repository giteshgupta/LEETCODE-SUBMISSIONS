class Solution
{
   boolean printAnc(Node root, int target)
{
      if(root==null) return false;
      if(root.data==target) return true;

      if(printAnc(root.left, target)||printAnc(root.left, target))
{
               System.out.print(root.data);
               return true;
}

      return false;
}
}