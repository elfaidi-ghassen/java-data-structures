import binarytree.IBinaryTree;
import binarytree.NullNode;
import binarytree.TreeNode;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

  
  int sum(IBinaryTree node) {
    if (node instanceof NullNode) {
      return 0;
    } else {
      return node.value() + sum(node.getLeftChild()) + sum(node.getRightChild());
    }
  }
  @Test
  void sumOfNode() {
    IBinaryTree nullNode = new NullNode();
    IBinaryTree node2 = new TreeNode(15, nullNode, nullNode);
    IBinaryTree node3 = new TreeNode(32, nullNode, nullNode);

    IBinaryTree node1 = new TreeNode(10, node2, node3);
        
    
    assertEquals(sum(node1), 15 + 32 + 10);
  }

}
