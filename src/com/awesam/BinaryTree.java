package com.awesam;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;



public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        root=first;
        first.left=second;
        first.right=third;
        second.left=forth;
        second.right=fifth;
        third.left=sixth;
    }

    public  void inOrder2(){
        if (root==null)return;
        Stack<TreeNode>stack=new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty()||temp!=null){
            if (temp!=null) {
                stack.push(temp);
                temp = temp.left;
            }
            else {
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
  public void postOrder2(){
        if (root==null)return;
        Stack<TreeNode>stack=new Stack<>();
        TreeNode current = root;
        while (current!=null||!stack.isEmpty()){
            if (current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                TreeNode temp = stack.peek().right;
                if (temp==null){
                    temp = stack.pop();
                    System.out.print(temp.data);
                    while (!stack.isEmpty()&&temp==stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data);
                    }
                }
                else current=temp;
            }
        }
    }

    public  void iterativePostOrder() {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }
    public void levelOrder(TreeNode root){
        if (root==null)return;
        Queue <TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+", ");
           if (temp.left!=null)queue.offer(temp.left);
            if (temp.right!=null)queue.offer(temp.right);
        }

    }
    public void preOrder(TreeNode root){
        if (root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public void preOrder2(TreeNode root){
        if (root==null)return;
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.data+", ");
            if (temp.right!=null)stack.push(temp.right);
            if (temp.left!=null)stack.push(temp.left);


        }
    }
    public void postOrder(TreeNode root){
        if(root==null)return;
        postOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");
    }
    public  int max(TreeNode root){
        if (root==null)return Integer.MIN_VALUE;
        int result = root.data;
        int left =max(root.left);
        int right =max(root.right);
        if (left>result)result=left;
        if (right>result)result=right;
        return result;
    }
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.iterativePostOrder();
        System.out.println();
        binaryTree.preOrder2(binaryTree.root);
        System.out.println("m");
        binaryTree.inOrder2();
        System.out.println();
        System.out.println(binaryTree.max(binaryTree.root));
    }
}
