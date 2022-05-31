package com.awesam;

import java.util.ArrayList;
import java.util.Random;

public class practice {
  public static void dailyCheckList(){
    ArrayList<Integer> arrayList=new ArrayList<>();
    Random random=new Random();
    while (arrayList.size()<101) {
      int randomGenerator = random.nextInt(101);
      if (!arrayList.contains(randomGenerator)) {
        arrayList.add(randomGenerator);
      }
    }
    for (int i= 0; i <arrayList.size() ; i++) {


      if (arrayList.get(i)==0) System.out.println("function to calculate sum of n number using o(1)");
      if (arrayList.get(i)==10) System.out.println("Implement a singly-linked class");
      if (arrayList.get(i)==11) System.out.println("function to find the length of a singly linked list ");
      if (arrayList.get(i)==12) System.out.println("function to insert a node at the beginning of singly linked list");
      if (arrayList.get(i)==13) System.out.println("function to insert a node at a given point of singly linked list");
      if (arrayList.get(i)==14) System.out.println("function to delete first node of singly linked list");
      if (arrayList.get(i)==15) System.out.println("function to delete last node of singly linked list");
      if (arrayList.get(i)==16) System.out.println("function to delete a node at a given point of singly linked list");
      if (arrayList.get(i)==17) System.out.println("function to search an element of singly linked list");
      if (arrayList.get(i)==18) System.out.println("function to reverse a singly linked list");
      if (arrayList.get(i)==19) System.out.println("function to find the middle node of a singly linked list");
      if (arrayList.get(i)==20) System.out.println("function to insert a node at the end of singly linked list");
      if (arrayList.get(i)==21) System.out.println("function to find the nth node at the end of singly linked list");
      if (arrayList.get(i)==22) System.out.println("function to remove duplicates of a sorted singly linked list");
      if (arrayList.get(i)==23) System.out.println("function to insert a node from a sorted singly linked list");
      if (arrayList.get(i)==24) System.out.println("function to detect a loop in a singly linked list");
      if (arrayList.get(i)==25) System.out.println("function to find start of a loop in a  singly linked list");
      if (arrayList.get(i)==26) System.out.println("proof floyd cycle detection algorithm");
      if (arrayList.get(i)==27) System.out.println("function to remove a loop from a singly linked list");
      if (arrayList.get(i)==28) System.out.println("class to implement a double linked list");
      if (arrayList.get(i)==29) System.out.println("Function to add a node at the beginning of a double linked list");
      if (arrayList.get(i)==30) System.out.println("Function to add a node at the end of a double linked list");
      if (arrayList.get(i)==31) System.out.println("Function to delete first node of a double linked list");
      if (arrayList.get(i)==32) System.out.println("Function to delete last node of a double linked list");
      if (arrayList.get(i)==33) System.out.println("class to implement a circular linked list");
      if (arrayList.get(i)==34) System.out.println("Function to add a node at the start of a circular linked list");
      if (arrayList.get(i)==35) System.out.println("Function to add a node at the end of a circular linked list");
      if (arrayList.get(i)==36) System.out.println("Function to delete first node of a circular linked list");
      if (arrayList.get(i)==38) System.out.println("function to remove even integer from an array");
      if (arrayList.get(i)==39) System.out.println("function to reverse an array");
      if (arrayList.get(i)==40) System.out.println("function to find minimum value from an array");
      if (arrayList.get(i)==41) System.out.println("function to find second maximum value from an array");
      if (arrayList.get(i)==42) System.out.println("function to resize an array");
      if (arrayList.get(i)==43) System.out.println("function to find missing value from an array");
      if (arrayList.get(i)==44) System.out.println("function to check if a string is palindrome");
      if (arrayList.get(i)==45) System.out.println("class to implement a stack");
      if (arrayList.get(i)==46) System.out.println("function to calculate sum of n number using o(1)");
      if (arrayList.get(i)==47) System.out.println("function to reverse a string using stack");
      if (arrayList.get(i)==48) System.out.println("function to find next greater elements using stacks");
      if (arrayList.get(i)==49) System.out.println("function to find valid parenthesis using stacks");
      if (arrayList.get(i)==50) System.out.println("class to implement a queue");
      if (arrayList.get(i)==51) System.out.println("class to implement a queue");
      if (arrayList.get(i)==52) System.out.println("Enque function of a queue");
      if (arrayList.get(i)==53) System.out.println("Deque function of a queue");
      if (arrayList.get(i)==54) System.out.println("Function to generate binary numbers using queue");
      if (arrayList.get(i)==55) System.out.println("class to implement a binary tree");
      if (arrayList.get(i)==56) System.out.println("Function for recursive pre-order binary tree traversal");
      if (arrayList.get(i)==57) System.out.println("Function for iterative pre-order binary tree traversal");
      if (arrayList.get(i)==58) System.out.println("Function for recursive in-order binary tree traversal");
      if (arrayList.get(i)==59) System.out.println("Function for iterative in-order binary tree traversal");
      if (arrayList.get(i)==60) System.out.println("Function for recursive post-order binary tree traversal");
      if (arrayList.get(i)==61) System.out.println("Function for iterative post-order binary tree traversal");
      if (arrayList.get(i)==62) System.out.println("Function for recursive level-order binary tree traversal");
      if (arrayList.get(i)==63) System.out.println("Function to find max value in a binary tree");
      if (arrayList.get(i)==64) System.out.println("class to implement a binary search tree");
      if (arrayList.get(i)==65) System.out.println("Function to insert a value in a binary tree");
      if (arrayList.get(i)==66) System.out.println("function to search an element in binary tree");
      if (arrayList.get(i)==67) System.out.println("function to validate a binary search tree");
      if (arrayList.get(i)==68) System.out.println("class to implement a queue");
      if (arrayList.get(i)==69) System.out.println("Enqueue function in a queue");
      if (arrayList.get(i)==70) System.out.println("Dequeue function in a queue");
      if (arrayList.get(i)==71) System.out.println("Function to generate a binary number using a queue");
      if (arrayList.get(i)==72) System.out.println("class to implement a binary tree");
      if (arrayList.get(i)==73) System.out.println("function of recursive preorder traversal of a binary tree");
      if (arrayList.get(i)==74) System.out.println("function of iterative preorder traversal of a binary tree");
      if (arrayList.get(i)==75) System.out.println("function of recursive inorder traversal of a binary tree");
      if (arrayList.get(i)==76) System.out.println("function of iterative inorder traversal of a binary tree");
      if (arrayList.get(i)==77) System.out.println("function of recursive postorder traversal of a binary tree");
      if (arrayList.get(i)==78) System.out.println("function of iterative postorder traversal of a binary tree");
      if (arrayList.get(i)==79) System.out.println("function of  levelOrder traversal of a binary tree ");
      if (arrayList.get(i)==80) System.out.println("Function to find maximum value in a binary tree");
      if (arrayList.get(i)==81) System.out.println("class to implement a binary search tree");
      if (arrayList.get(i)==82) System.out.println("Function to insert a value in a binary search tree");
      if (arrayList.get(i)==83) System.out.println("Function to search a value in a binary search tree ");
      if (arrayList.get(i)==84) System.out.println("Function to validate a binary search tree");
      if (arrayList.get(i)==85) System.out.println("Function to search in a row and a column wise sorted matrix");
      if (arrayList.get(i)==86) System.out.println("Function to print matrix in spiral form");
      if (arrayList.get(i)==87) System.out.println("class to implement a priority queue and binary heap");
      if (arrayList.get(i)==88) System.out.println("Function to insert a value in a max heap");
      if (arrayList.get(i)==89) System.out.println("Function to implement bottom up reheapify");
      if (arrayList.get(i)==90) System.out.println("Function to implement top-down reheapify");
      if (arrayList.get(i)==91) System.out.println("Function to delete max element in a max heap");
      if (arrayList.get(i)==92) System.out.println("Function to implement linear search ");
      if (arrayList.get(i)==93) System.out.println("Function to implement binary search ");
      if (arrayList.get(i)==94) System.out.println("Function to implement bubble sort ");
      if (arrayList.get(i)==95) System.out.println("Function to implement insertion sort");
      if (arrayList.get(i)==96) System.out.println("Function to implement selection sort");
      if (arrayList.get(i)==97) System.out.println("Function to merge two sorted arrays in Java");
      if (arrayList.get(i)==98) System.out.println("class to implement a circular liked list");
      if (arrayList.get(i)==99) System.out.println("class to implement a circular liked list");
      if (arrayList.get(i)==100) System.out.println("class to implement a queue");
      if (arrayList.get(i)==100) System.out.println("function to calculate area of a circle and a rectangle using method overloading");

      if(arrayList.get(i)>0&&arrayList.get(i)<10||arrayList.get(i)==37) System.out.println("*Function: postOrder iterative binary tree traversal(37)!");

    }
  }
    static void randomize(){
        Random random= new Random();
        int randomgenrator = random.nextInt(101);
      if (randomgenrator==0) System.out.println("function to calculate sum of n number using o(1)");
        if (randomgenrator==10) System.out.println("Implement a singly-linked class");
        if (randomgenrator==11) System.out.println("function to find the length of a singly linked list ");
        if (randomgenrator==12) System.out.println("function to insert a node at the beginning of singly linked list");
        if (randomgenrator==13) System.out.println("function to insert a node at a given point of singly linked list");
        if (randomgenrator==14) System.out.println("function to delete first node of singly linked list");
        if (randomgenrator==15) System.out.println("function to delete last node of singly linked list");
        if (randomgenrator==16) System.out.println("function to delete a node at a given point of singly linked list");
        if (randomgenrator==17) System.out.println("function to search an element of singly linked list");
        if (randomgenrator==18) System.out.println("function to reverse a singly linked list");
        if (randomgenrator==19) System.out.println("function to find the middle node of a singly linked list");
        if (randomgenrator==20) System.out.println("function to insert a node at the end of singly linked list");
        if (randomgenrator==21) System.out.println("function to find the nth node at the end of singly linked list");
        if (randomgenrator==22) System.out.println("function to remove duplicates of a sorted singly linked list");
        if (randomgenrator==23) System.out.println("function to insert a node from a sorted singly linked list");
        if (randomgenrator==24) System.out.println("function to detect a loop in a singly linked list");
        if (randomgenrator==25) System.out.println("function to find start of a loop in a  singly linked list");
        if (randomgenrator==26) System.out.println("proof floyd cycle detection algorithm");
        if (randomgenrator==27) System.out.println("function to remove a loop from a singly linked list");
        if (randomgenrator==28) System.out.println("class to implement a double linked list");
        if (randomgenrator==29) System.out.println("Function to add a node at the beginning of a double linked list");
        if (randomgenrator==30) System.out.println("Function to add a node at the end of a double linked list");
        if (randomgenrator==31) System.out.println("Function to delete first node of a double linked list");
        if (randomgenrator==32) System.out.println("Function to delete last node of a double linked list");
        if (randomgenrator==33) System.out.println("class to implement a circular linked list");
        if (randomgenrator==34) System.out.println("Function to add a node at the start of a circular linked list");
        if (randomgenrator==35) System.out.println("Function to add a node at the end of a circular linked list");
        if (randomgenrator==36) System.out.println("Function to delete first node of a circular linked list");
        if (randomgenrator==38) System.out.println("function to remove even integer from an array");
        if (randomgenrator==39) System.out.println("function to reverse an array");
        if (randomgenrator==40) System.out.println("function to find minimum value from an array");
        if (randomgenrator==41) System.out.println("function to find second maximum value from an array");
        if (randomgenrator==42) System.out.println("function to resize an array");
        if (randomgenrator==43) System.out.println("function to find missing value from an array");
        if (randomgenrator==44) System.out.println("function to check if a string is palindrome");
        if (randomgenrator==45) System.out.println("class to implement a stack");
        if (randomgenrator==46) System.out.println("function to calculate sum of n number using o(1)");
        if (randomgenrator==47) System.out.println("function to reverse a string using stack");
        if (randomgenrator==48) System.out.println("function to find next greater elements using stacks");
        if (randomgenrator==49) System.out.println("function to find valid parenthesis using stacks");
        if (randomgenrator==50) System.out.println("class to implement a queue");
      if (randomgenrator==51) System.out.println("class to implement a queue");
      if (randomgenrator==52) System.out.println("Enque function of a queue");
      if (randomgenrator==53) System.out.println("Deque function of a queue");
      if (randomgenrator==54) System.out.println("Function to generate binary numbers using queue");
      if (randomgenrator==55) System.out.println("class to implement a binary tree");
      if (randomgenrator==56) System.out.println("Function for recursive pre-order binary tree traversal");
      if (randomgenrator==57) System.out.println("Function for iterative pre-order binary tree traversal");
      if (randomgenrator==58) System.out.println("Function for recursive in-order binary tree traversal");
      if (randomgenrator==59) System.out.println("Function for iterative in-order binary tree traversal");
      if (randomgenrator==60) System.out.println("Function for recursive post-order binary tree traversal");
      if (randomgenrator==61) System.out.println("Function for iterative post-order binary tree traversal");
      if (randomgenrator==62) System.out.println("Function for recursive level-order binary tree traversal");
      if (randomgenrator==63) System.out.println("Function to find max value in a binary tree");
      if (randomgenrator==64) System.out.println("class to implement a binary search tree");
      if (randomgenrator==65) System.out.println("Function to insert a value in a binary tree");
      if (randomgenrator==66) System.out.println("function to search an element in binary tree");
      if (randomgenrator==67) System.out.println("function to validate a binary search tree");
      if (randomgenrator==68) System.out.println("class to implement a queue");
      if (randomgenrator==69) System.out.println("Enqueue function in a queue");
      if (randomgenrator==70) System.out.println("Dequeue function in a queue");
      if (randomgenrator==71) System.out.println("Function to generate a binary number using a queue");
      if (randomgenrator==72) System.out.println("class to implement a binary tree");
      if (randomgenrator==73) System.out.println("function of recursive preorder traversal of a binary tree");
      if (randomgenrator==74) System.out.println("function of iterative preorder traversal of a binary tree");
      if (randomgenrator==75) System.out.println("function of recursive inorder traversal of a binary tree");
      if (randomgenrator==76) System.out.println("function of iterative inorder traversal of a binary tree");
      if (randomgenrator==77) System.out.println("function of recursive postorder traversal of a binary tree");
      if (randomgenrator==78) System.out.println("function of iterative postorder traversal of a binary tree");
      if (randomgenrator==79) System.out.println("function of  levelOrder traversal of a binary tree ");
      if (randomgenrator==80) System.out.println("Function to find maximum value in a binary tree");
      if (randomgenrator==81) System.out.println("class to implement a binary search tree");
      if (randomgenrator==82) System.out.println("Function to insert a value in a binary search tree");
      if (randomgenrator==83) System.out.println("Function to search a value in a binary search tree ");
      if (randomgenrator==84) System.out.println("Function to validate a binary search tree");
      if (randomgenrator==85) System.out.println("Function to search in a row and a column wise sorted matrix");
      if (randomgenrator==86) System.out.println("Function to print matrix in spiral form");
      if (randomgenrator==87) System.out.println("class to implement a priority queue and binary heap");
      if (randomgenrator==88) System.out.println("Function to insert a value in a max heap");
      if (randomgenrator==89) System.out.println("Function to implement bottom up reheapify");
      if (randomgenrator==90) System.out.println("Function to implement top-down reheapify");
      if (randomgenrator==91) System.out.println("Function to delete max element in a max heap");
      if (randomgenrator==92) System.out.println("Function to implement linear search ");
      if (randomgenrator==93) System.out.println("Function to implement binary search ");
      if (randomgenrator==94) System.out.println("Function to implement bubble sort ");
      if (randomgenrator==95) System.out.println("Function to implement insertion sort");
      if (randomgenrator==96) System.out.println("Function to implement selection sort");
      if (randomgenrator==97) System.out.println("Function to merge two sorted arrays in Java");
      if (randomgenrator==98) System.out.println("class to implement a circular liked list");
      if (randomgenrator==99) System.out.println("class to implement a circular liked list");
      if (randomgenrator==100) System.out.println("class to implement a queue");
      if (randomgenrator==100) System.out.println("function to calculate area of a circle and a rectangle using method overloading");

        if(randomgenrator>0&&randomgenrator<10||randomgenrator==37) System.out.println("Function: postOrder iterative binary tree traversal(37)!");

    }/*
   public ListNode insertSort(int key){
      ListNode node = new ListNode(key);
      if (head==null)return node;
      ListNode current = head;
      ListNode previous = null;
      while (current!=null&&current.data>node.data){
        previous= current;
        current=current.next;
      }
      node.next=current;
      previous.next=current;
      return head;
   }
  public ListNode insertSort2(int value){
    ListNode node = new ListNode(value);
    if (head==null)return node;
    ListNode current = head;
    ListNode previous = null;
    while (current!=null&&current.data<node.data){
      previous=current;
      current=current.next;
    }
    node.next=current;
    previous.next=node;
    return head;
  }
   public ListNode delete(){
        if (isEmpty())throw new NoSuchElementException();
      if (head==null)tail=null;
      else head.next.previous=null;
      ListNode result = head;
      head= result.next;
      result.next=null;
      return result;
    }*/
    public static void main(String[] args) {
      dailyCheckList();
      System.out.println();
        randomize();

    }
}
