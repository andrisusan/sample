package linkedlist;

/**
 * @author Andri Susanto
 */
public class Node {

  int data;
  Node next;

  static int count(Node node) {
    int count = 0;
    Node current = node;
    while (null != current) {
      current = current.next;
      count += 1;
    }
    return count;
  }

  public static void main(String[] args) {
    Node head = new Node();
    head.data = 1;

    Node two = new Node();
    two.data = 2;

    head.next = two;

    System.out.println(count(head));
  }

}
