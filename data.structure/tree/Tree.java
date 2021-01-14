package tree;

/**
 * @author Andri Susanto
 */
public class Tree {

  static class Node {
    int data;
    Node left;
    Node right;

    Node (int data) {
      this.data = data;
    }
  }

  static int sumValue(Node node) {
    if (null == node) {
      return 0;
    }
    return node.data + sumValue(node.left) + sumValue(node.right);
  }

  public static void main(String[] args) {
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);

    node2.left = node3;
    node2.right = node4;
    node3.left = node5;
    node3.right = node6;

    System.out.println("Sum of all values of this tree is (should print 20):");
    System.out.println(sumValue(node2));
  }

}
