package core.datastructres.trees;

import java.util.ArrayList;

public interface BinaryTreeTraversalInterface<E> {

  ArrayList<E> preorderTraversal(BinaryNode<E> root);

  ArrayList<E> postorderTraversal(BinaryNode<E> root);

  ArrayList<E> inorderTraversal(BinaryNode<E> root);
}
