package binarytree;

public class TreeNode implements IBinaryTree{
  private int value;
  private IBinaryTree leftChild;
  private IBinaryTree rightChild;
  public TreeNode(int value, IBinaryTree left, IBinaryTree right) {
    this.value = value;
    this.leftChild = left;
    this.rightChild = right;
  }
  public Integer value() {
    return value;
  }
  
  public IBinaryTree getLeftChild() {
    return leftChild;
  }
  public IBinaryTree getRightChild() {
    return rightChild;
  }
}
