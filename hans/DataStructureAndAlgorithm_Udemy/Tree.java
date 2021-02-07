import java.util.List;

class BinaryTreeNode {
  BinaryTreeNode left;
  BinaryTreeNode right;
  int value;

  public BinaryTreeNode(int value) {
    this.value = value;
  }
}


class BinarySearchTree {
  BinaryTreeNode root;
  public BinarySearchTree() {
  }

  public void breadthFirstSearch() {
    List<BinaryTreeNode> list = new ArrayList();
    List<BinaryTreeNode> queue = new ArrayList();

    queue.add(root);
    while(queue.isEmpty() == false) {
      BinaryTreeNode currentNode = queue.remove(0);
      if(currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if(currentNode.right != null) {
        queue.add(currentNode.right);
      }
      list.add(currentNode);
    }
  }

  public List<BinaryTreeNode> breadthFirstSearchR(List<BinaryTreeNode> queue, List<BinaryTreeNode> list) {
    if(queue.isEmpty()) {
      return list;
    }
    BinaryTreeNode currentNode = queue.remove(0);
    list.add(currentNode);
    if(currentNode.left != null) {
      queue.add(currentNode.left);
    }
    if(currentNode.right != null) {
      queue.add(currentNode.right);
    }

    return breadthFirstSearchR(queue, list);
  }

  public void DFSInOrder(BinaryTreeNode node, List<BinaryTreeNode> list) {
    if(node.left) {
      DFSInOrder(node.left, list);
    }
    list.add(node);
    if(node.right) {
      DFSInOrder(node.right, list);
    }
  }
  public void DFSPreOrder(BinaryTreeNode node, List<BinaryTreeNode> list) {
    list.add(node);

    if(node.left) {
      DFSPreOrder(node.left, list);
    }
    
    if(node.right) {
      DFSPreOrder(node.right, list);
    }
  }
  public void DFSPostOrder(BinaryTreeNode node, List<BinaryTreeNode> list) {
    if(node.left) {
      DFSPostOrder(node.left, list);
    }
    
    if(node.right) {
      DFSPostOrder(node.right, list);
    }

    list.add(node);
  }

  //     9
  //  4     20
  // 1  6  15  170

  // public BinarySearchTree insert(int value) {
  //   if(root == null) {
  //     root = new BinaryTreeNode(value);
  //   } else {
  //     BinaryTreeNode currnetNode = root;
  //     BinaryTreeNode nodeToInsert = new BinaryTreeNode(value);
  //     while(true) {
  //       if(currentNode.value > value) {
  //         if(currentNode.left == null) {
  //           currentNode.left = nodeToInsert;
  //           return this;
  //         }
  //         currentNode = currentNode.left;
  //       } else if(currentNode.value < value) {
  //         if(currentNode.right == null) {
  //           currentNode.right = nodeToInsert;
  //           return this;
  //         }
  //         currentNode = currentNode.right;
  //       }
  //     }
  //   }
  // }

  // private BinaryTreeNode lookup(int value) {
  //   if(root == null) return null;

  //   BinaryTreeNode currentNode = root;
  //     while(true) {
  //       if(currentNode.value == value) return currentNode;

  //       if(currentNode.value > value) {
  //         if(currentNode.left == null) {
  //           return null;
  //         }
  //         currentNode = currentNode.left;
  //       } else if(currentNode.value < value) {
  //         if(currentNode.right == null) {
  //           return null;
  //         }
  //         currentNode = currentNode.right;
  //       }
  //     }
  // }

  // private void insertInternalImpl(BinaryTreeNode node, int value) {
  //   if(node.value == value) return;

  //   if(node.value > value) {
  //     if(node.left == null) {
  //       node.left = new BinaryTreeNode(value);
  //     } else {
  //       insertInternalImpl(node.left, value);
  //     } 
  //   } 

  //   if(node.value < value) {
  //     if(node.right == null) {
  //       node.right = new BinaryTreeNode(value);
  //     } else {
  //       insertInternalImpl(node.right, value);
  //     } 
  //   }
  // }

  // tree
} 