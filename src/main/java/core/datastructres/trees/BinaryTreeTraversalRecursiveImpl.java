package core.datastructres.trees;

import java.util.ArrayList;

public class BinaryTreeTraversalRecursiveImpl<E> implements BinaryTreeTraversalInterface<E> {

  private ArrayList<E> resultList;

  private static <E> void preorderTraversalRecursive(BinaryNode<E> node, ArrayList<E> resultList) {
    if (node == null) {
      return;
    }
    resultList.add(node.value());
    preorderTraversalRecursive(node.left(), resultList);
    preorderTraversalRecursive(node.right(), resultList);
  }

  private static <E> void postorderTraversalRecursive(BinaryNode<E> node, ArrayList<E> resultList) {
    if (node == null) {
      return;
    }
    postorderTraversalRecursive(node.left(), resultList);
    postorderTraversalRecursive(node.right(), resultList);
    resultList.add(node.value());
  }

  private static <E> void inorderTraversalRecursive(BinaryNode<E> node, ArrayList<E> resultList) {
    if (node == null) {
      return;
    }
    inorderTraversalRecursive(node.left(), resultList);
    resultList.add(node.value());
    inorderTraversalRecursive(node.right(), resultList);
  }

  @Override
  public ArrayList<E> preorderTraversal(BinaryNode<E> root) {
    resultList = new ArrayList<>();
    preorderTraversalRecursive(root, resultList);
    return resultList;
  }

  @Override
  public ArrayList<E> postorderTraversal(BinaryNode<E> root) {
    resultList = new ArrayList<>();
    postorderTraversalRecursive(root, resultList);
    return resultList;
  }

  @Override
  public ArrayList<E> inorderTraversal(BinaryNode<E> root) {
    resultList = new ArrayList<>();
    inorderTraversalRecursive(root, resultList);
    return resultList;
  }
}
