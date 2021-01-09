class Node {
  int key;
  Node left, right;

  public Node(int item) {
    key = item;
    left = right = null;
  }

}

class Binary1 {
  Node root;

  public void traverseTree(Node node) {
    if(node != null) {
      traverseTree(node.left);
      System.out.println(" " + node.key);
      traverseTree(node.right);
    }
  }

  public static void main(String[] args) {
    Binary1 tree = new Binary1();

    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);

    tree.root.left.left = new Node(4);

    System.out.print(" \n Binary tree: " );
    tree.traverseTree(tree.root);


  }
}