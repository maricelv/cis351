/*
 * OpenDSA Project Distributed under the MIT License
 * 
 * Copyright (c) 2011-2016 - Ville Karavirta and Cliff Shaffer
 * 
 * @author Maricel Vicente
 */

// Unfinished Binary Search Tree implementation
class BST<E extends Comparable<E>> {
  protected BSTNode<E> root; // Root of the BST
  protected int nodecount; // Number of nodes in the BST

  // constructor
  BST() {
    root = null;
    nodecount = 0;
  }

  // Reinitialize tree
  public void clear() {
    root = null;
    nodecount = 0;
  }

  // Insert a record into the tree.
  // Records can be anything, but they must be Comparable
  // e: The record to insert.
  public void insert(E e) {
    root = inserthelp(root, e);
    nodecount++;
  }

  private BSTNode<E> inserthelp(BSTNode<E> rt, E e) {
    if (rt == null)
      return new BSTNode<E>(e);
    if (rt.element().compareTo(e) >= 0)
      rt.setLeft(inserthelp(rt.left(), e));
    else
      rt.setRight(inserthelp(rt.right(), e));
    return rt;

  }


  // Return the record with key value k, null if none exists
  // key: The key value to find
  public E find(E key) {
    return findhelp(root, key);
  }

  private E findhelp(BSTNode<E> rt, E key) {
    if (rt == null)
      return null;
    if (rt.element().compareTo(key) > 0)
      return findhelp(rt.left(), key);
    if (rt.element().compareTo(key) == 0)
      return rt.element();
    else
      return findhelp(rt.right(), key);

  }

  // Return the number of records in the dictionary
  public int size() {
    return nodecount;
  }


  // UNFINISHED METHODS BELOW THIS POINT**************************

  /**
   * Recursively calculate the number of nodes in this BST.
   */
  public int recursiveSize() {
    // You will need a recursive helper method!
    return sizeHelper(root);
  }
  
  public int sizeHelper(BSTNode<E> node) {
    
    // if node is 0, return null
    if (node == null) {
      return 0;
    }
    
    // return recursive: 1 + left node + right node
    return 1 + sizeHelper(node.left()) + sizeHelper(node.right());
    
  }

  /**
   * Return the smallest element in the tree.
   */
  public E minElement() {
    return minHelper(root);
  }
  
  public E minHelper(BSTNode<E> node) {
    // base case
    if (node == null) {
      return null;
    }
    // check if the left node is null, then return the smallest element
    if (node.left() == null) {
      return node.element();
    }
    // return recursive call to check the left node until it is null
    return minHelper(node.left());
    
  }

  /**
   * Return the largest element in the tree.
   */
  public E maxElement() {
    return maxHelper(root);
  }
  
  public E maxHelper(BSTNode<E> node) {
     // base case
    if (node == null) {
      return null;
    }
    // check if the node is null, then return the largest element
    if (node.right() == null) {
      return node.element();
    }
    // return recursive call to check right node until it is null
    return maxHelper(node.right());
  }

  /**
   * Return an ordered linked list containing all of the elements from the tree.
   */
  public LList<E> makeOrderedList() {
    LList<E> newList = new LList<E>();
    
    // helper function
    orderedListHelper(root,newList);

    //return the new list
    return newList;
  }
  
  public void orderedListHelper(BSTNode<E> node, LList<E> list){
   if(node != null)
   {   
       // add nodes from left subtree into the list
       orderedListHelper(node.left(), list);
       // need to add element in list by appending
       list.append(node.element());
       // add nodes from right subtree into the list
       orderedListHelper(node.right(), list);
       // don't need to append element at the end because the if statement checks then adds
   }
}

  /**
   * Return true if this BST actually has the BST property and false if it does
   * not.
   * 
   * (Note that this method would typically not be necessary. It a correctly
   * coded BST there will be no possibility of violating the BST property.)
   * 
   */
  public boolean isValidBST() {
    return isValidHelper(root);
  }
  
  public boolean isValidHelper(BSTNode<E> node) {
    // base case, if the node is true
    if (node == null || node.isLeaf()) {
      return true;
    }
    
    // For false BST,
    // check if maximum element on left subtreee is larger than the current element
    // CANNOT compare maxHelper(node.left()) < node.element() so use compareTo
    if (node.left() != null && maxHelper(node.left()).compareTo(node.element()) > 0)  {
      return false;
    }
    
    // For false BST,
    // check if minimum element on right subtree is smaller than current element
    if (node.right() != null && minHelper(node.right()).compareTo(node.element()) < 0) {
      return false;
       }
        
      // recursive check the left and right subtree  
      return isValidHelper(node.left()) && isValidHelper(node.right());
        
    
  }
  
  
 



}

