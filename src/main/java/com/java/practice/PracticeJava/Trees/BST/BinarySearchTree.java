package com.java.practice.PracticeJava.Trees.BST;

public class BinarySearchTree {

    public static void main(String[] args) {
        BST tree= new BST();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder(tree.root);

    }
}

class BST{

    Node root;

    public BST() {
        this.root=null;
    }

    public BST(Node root) {
        this.root = root;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    public void inorder(Node root){

        if (root == null)
            return;

        if (root.left !=null){
            inorder(root.left);
        }

        System.out.println(root.key);

        if (root.right !=null){
            inorder(root.right);
        }
    }

}

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}