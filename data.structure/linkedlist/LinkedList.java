package linkedlist;

/**
 * @author Andri Susanto
 */
public class LinkedList {

  Node head;

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }

  static Node reverse(Node node) {
    Node prev = null;
    Node current = node;
    Node next = null;

    while (current != null) {
      next = current.next;
      current.next = prev;

      // move prev and current step forward
      prev = current;
      current = next;
    }
    // move tail to head
    node = prev;
    return node;
  }

  int count() {
    int count = 0;
    while (null != head) {
      count += 1;
      head = head.next;
    }
    return count;
  }

  static int count(Node node) {
    int count = 0;
    while (null != node) {
      count += 1;
      node = node.next;
    }
    return count;
  }

  static void print(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }

  public static void main(String[] args) {
//    LinkedList linkedList = new LinkedList();
    Node first = new Node(1);

    Node second = new Node(2);
    first.next = second;

    Node third = new Node(3);
    second.next = third;

    System.out.println("Count node " +LinkedList.count(first));
    System.out.print("Before reverse ");
    print(first);
    System.out.println();
    System.out.print("After reverse ");
    print(reverse(first));

  }

}
