/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
import java.util.*;
class Result {
  static int findRightSibling(Node root, int key) {
       // if(key==root.data) return -1;
     if(root==null) return -1;
         Queue<Node> q=new LinkedList<Node>();
         q.add(root);
    while(!q.isEmpty())
    {
      Node temp=q.poll();
      if(key==temp.data && q.isEmpty())
        return -1;
      else if(key==temp.data)
      {
        return q.peek().data;
      }
      if(temp.leftChild!=null)  q.add(temp.leftChild);
      if(temp.rightChild!=null)  q.add(temp.rightChild); 
    }
     return -1; 
  }
}