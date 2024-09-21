package binarytree;

public class NullNode implements IBinaryTree {
  public NullNode() {};
  public Integer value() {
    return null;
  }
  public IBinaryTree getLeftChild() {
    return new NullNode();
  }
  public IBinaryTree getRightChild() {
    return new NullNode();
  }
}
