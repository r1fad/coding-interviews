public class PartitionByX{

  public static Node partition(Node node, int x){

    Node head = node;
    Node tail = node;

    while (node != null){
      Node next  = node.next;
      if (node.value < x){
        node.next = head;
        head = node;
      }
      else{
        tail.next = node;
        tail = node;
      }
      node = next;
    }
    tail.next = null;

    return head;
  }

  public static void main(String[] args){
    Node a = new Node(3);
    Node b = new Node(5);
    Node c = new Node(8);
    Node d = new Node(7);
    Node e = new Node(10);
    Node f = new Node(2);
    a.append(b);
    b.append(c);
    c.append(d);
    d.append(e);
    e.append(f);
    a.print();
    partition(a,5).print();
  }
}
