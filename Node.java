public class Node{
  public int value;
  public Node next;

  public Node(int val){
    value = val;
  }

  public void append(Node node){
    this.next = node;
  }

  public void print(){
    Node current = this;
    while (current != null){
      System.out.print(current.value);
      if (current.next != null) System.out.print("->");
      current = current.next;
    }
    System.out.println();
  }
}
