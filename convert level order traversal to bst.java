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
  static Node buildSearchTree(int t[], int n) {
    Node root = null;
    root= insert(t,root, 0, n);
    // Complete the function body.
    return(root);
  }
  static Node insert(int a[], Node root,int i,int n)
  {
    if(i<n)
    {
    Node temp= new Node(a[i]);
     root =temp;
      root.leftChild = insert(a,root.leftChild,2*i+1,n);
      root.rightChild = insert(a,root.rightChild,2*i+2,n);
    }
    return root;
  }
}