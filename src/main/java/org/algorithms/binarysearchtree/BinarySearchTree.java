package org.algorithms.binarysearchtree;

public class BinarySearchTree {

    Node root;

    public void insertNode(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.leftNode = insertHelper(root.leftNode, node);
        } else {
            root.rightNode = insertHelper(root.rightNode, node);
        }
        return root;
    }

    public void displayTree() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            // inorder traversal
            displayHelper(root.leftNode);
            System.out.println(root.data);
            displayHelper(root.rightNode);
            // preorder traversal
//            System.out.println(root.data);
//            displayHelper(root.leftNode);
//            displayHelper(root.rightNode);
//            // postorder traversal
//            displayHelper(root.leftNode);
//            displayHelper(root.rightNode);
//            System.out.println(root.data);
        }
    }

    public boolean searchNode(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.leftNode, data);
        } else {
            return searchHelper(root.rightNode, data);
        }
    }

    public void deleteNode(int data) {
        if (searchNode(data)) {
            deleteHelper(root, data);
        } else {
            System.out.println("data not found");
        }

    }

    private Node deleteHelper(Node root, int data) {
        if (root == null) {
            return null;
        } else if (data < root.data) {
            root.leftNode = deleteHelper(root.leftNode, data);
        } else if (data > root.data) {
            root.rightNode = deleteHelper(root.rightNode, data);
        }// found the element
        else {
            if (root.leftNode == null && root.rightNode == null) {
                // it is a leaf node, no more children in it.
                root = null;
            } else if (root.rightNode != null) {
                root.data = successor(root);// find successor to replace this node
                root.rightNode = deleteHelper(root.rightNode, root.data);
            } else {
                root.data = predecessor(root); // find predecessor to replace this node
                root.leftNode = deleteHelper(root.leftNode, root.data);
            }
        }
        return root;
    }

    private int predecessor(Node root) {// find the greatest value below the right child of the root node
        root = root.leftNode;
        while (root.rightNode != null) {
            root = root.rightNode;
        }
        return root.data;
    }

    private int successor(Node root) {// find the least value below the left child of the root node
        root = root.rightNode;
        while (root.leftNode != null) {
            root = root.leftNode;
        }
        return root.data;
    }

}
