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

    public boolean isValid(long min, long max){
        return isValid( root,min,max);
    }
    public  boolean isValid(TreeNode root,long min,long max){
        if (root==null)return true;
        if (root.data<=min||root.data>=max)return false;
        boolean left = isValid(root.left,min,root.data);
        if (left){
            return  isValid(root.right, root.data,max);
        }
        return false;
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
        BinarySearchTree binarySearchTree2=new BinarySearchTree();
        binarySearchTree2.insert(5);
        binarySearchTree2.insert(2);
        binarySearchTree2.insert(9);
        binarySearchTree2.insert(6);
        binarySearchTree2.insert(4);
        System.out.println();
        long min =Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        String result1= (binarySearchTree.isValid(min,max))
                ?"binary tree validated!"
                :"binary tree is not validated!";
        System.out.println(result1);
    }

}