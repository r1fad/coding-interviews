public class FindKElement{

  public static int printKToLast(Node head, int k){
    if (head == null) return 0;

    int index = printKToLast(head.next, k)+1;
    if(index == k)
      System.out.println(k + "th to the last node is " + head.value);

    return index;
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
    printKToLast(a,1);
    printKToLast(a,2);
    printKToLast(a,3);
  }
}
