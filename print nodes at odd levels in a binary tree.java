class Result {
  static void printOdd(Node root) 
  {
       printOddNodes( root, true);
  }
  static void printOddNodes(Node root, boolean isOdd)
  {
    if(root==null) return;
    if(isOdd==true)
    {
   System.out.print(root.data+" ");
    }
    printOddNodes( root.leftChild, !isOdd);
      printOddNodes( root.rightChild, !isOdd);
  }
}