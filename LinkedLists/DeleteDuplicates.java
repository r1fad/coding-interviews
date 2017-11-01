import java.util.HashSet;

public class DeleteDuplicates{

  public static void deleteDups(Node n){
    HashSet<Integer> set = new HashSet<Integer>();

    Node previous = null;

    while(n != null){
      // if value already in set, unlink node from the list
      if (set.contains(n.value))
        previous.next = n.next;
      else{
        set.add(n.value);
        previous = n;
      }
      n = n.next;
    }
  }

  public static void deleteDupsNoBuffer(Node head){
    Node current = head;

    while (current != null){
      // Remove all future nodes that have the same value
      Node runner = current;
      while (runner.next != null){
        if (runner.next.value == current.value)
          runner.next = runner.next.next;
        else
          runner = runner.next;
      }
      current = current.next;
    }
  }

  public static void main(String[] args){
    Node a = new Node(2);
    Node b = new Node(4);
    Node c = new Node(6);
    Node d = new Node(4);
    Node e = new Node(6);
    Node f = new Node(8);
    a.append(b);
    b.append(c);
    c.append(d);
    d.append(e);
    e.append(f);
    a.print();
    deleteDupsNoBuffer(a);
    a.print();

  }
}
