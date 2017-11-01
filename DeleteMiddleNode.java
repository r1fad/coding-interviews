public class DeleteMiddleNode{

  public static boolean deleteMidNode(Node mid){
    if (mid==null || mid.next==null)
      return false; //Fails
    mid.value = mid.next.value;
    mid.next = mid.next.next;
    return true;
  }

  public static void main(String[] args){
    Node a = new Node(2);
    Node b = new Node(4);
    Node c = new Node(6);
    Node d = new Node(8);
    Node e = new Node(10);
    Node f = new Node(12);
    a.append(b);
    b.append(c);
    c.append(d);
    d.append(e);
    e.append(f);
    a.print();
    deleteMidNode(f);
    a.print();
  }

}
