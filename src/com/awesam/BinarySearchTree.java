package com.awesam;

import javax.swing.tree.TreeNode;

public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }
    public TreeNode insert(TreeNode root,int value){
        if (root==null){
            root=new TreeNode(value);
            return root;
        }
        if (value< root.data)root.left=insert(root.left,value);
        else if (value> root.data)root.right=insert(root.right,value);
        return root;
    }
    public void inOrder(TreeNode root){
        if (root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public TreeNode search(TreeNode root,int key){
        if (root==null||root.data==key)return root;
        if (key<root.data) return search(root.left,key);
        else return search(root.right,key);
    }
    public  void insert(int value){
        root= insert(root,value);
    }


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree= new BinarySearchTree();
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(13);
        binarySearchTree.insert(15);
        binarySearchTree.insert(16);
        binarySearchTree.inOrder(binarySearchTree.root);
        binarySearchTree.search(binarySearchTree.root, 2);
    }

}