/* class QueueNode
{
  int data;
  int priority;
  QueueNode next;
  public QueueNode(int data, int p) 
  {
    this.data = data;
    this.priority = p;
  }
} is provided to you. */ 

class PQueueLL
{
  public QueueNode head,tail;
  public void EnQueue(int data, int priority)
  {
    QueueNode temp=new QueueNode(data, priority);
    if(head==null)
    {
      head=temp;
      tail=head;
    }
    else 
    {
      if(temp.priority<head.priority)
      {
        temp.next=head;
        head=temp;
      }
     else if(temp.priority>tail.priority)
      {
        tail.next=temp;
        tail=temp;
      }
     else if (temp.priority>head.priority && temp.priority<tail.priority)
     {
       head.next=temp;
       temp.next=tail;
     }
    }
  }    

  public int DeQueue()
  {
    if(head==null) return -1;
    int x= head.data;
    head=head.next;
    return x;
  }    
}