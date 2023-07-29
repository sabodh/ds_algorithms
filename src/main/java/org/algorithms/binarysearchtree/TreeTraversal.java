package org.algorithms.binarysearchtree;

public class TreeTraversal {

    public static void main(String arg[]){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insertNode(new Node(1));
        tree.insertNode(new Node(5));
        tree.insertNode(new Node(8));
        tree.insertNode(new Node(7));
        tree.insertNode(new Node(9));
        tree.insertNode(new Node(3));
        tree.insertNode(new Node(2));
        tree.insertNode(new Node(6));
        tree.insertNode(new Node(4));
//        tree.deleteNode(6);
        tree.displayTree();
//        System.out.println( tree.searchNode(9));
    }
}
