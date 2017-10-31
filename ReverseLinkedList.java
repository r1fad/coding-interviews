public class ReverseLinkedList{

  public static Node reverse(Node givenNode){

    if (givenNode == null) return null;
    if (givenNode.next == null) return givenNode;

    Node nextNode = givenNode.next;

    // unlink the given node from the next node
    givenNode.next = null;

    Node reversed = reverse(nextNode);

    nextNode.next = givenNode;

    return reversed;
  }

  public static void main(String[] args){
    Node a = new Node(2);
    Node b = new Node(4);
    Node c = new Node(6);
    a.append(b);
    b.append(c);
    a.print();
    a = reverse(a);
    a.print();
  }

}
