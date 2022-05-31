package com.awesam;

import java.util.NoSuchElementException;

public class DoubleLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    private class ListNode{
        private ListNode next;
        private ListNode previous;
        private int data;
        public ListNode(int data){
            this.data=data;
        }
    }
    public DoubleLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void  printForward(){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertFirst(int value){
        ListNode node=new ListNode(value);
        if (isEmpty())tail=node;
        else head.previous = node;
            node.next = head;
            head = node;
            length++;

    }
    public void insertLast(int value){
        ListNode node = new ListNode(value);
        if (isEmpty())head=node;
        else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        length++;
    }
    public ListNode deleteLast(){
        if (isEmpty())throw new NoSuchElementException();
        if (tail==null)head=null;
        else tail.previous.next=null;
        ListNode temp=tail;
        tail.previous=null;
        return temp;

    }
    public static void main(String[] args) {
    DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        doubleLinkedList.insertLast(5);
        doubleLinkedList.insertLast(4);
        doubleLinkedList.insertLast(3);
        doubleLinkedList.insertLast(2);
        doubleLinkedList.insertLast(1);
        doubleLinkedList.insertLast(0);
        doubleLinkedList.insertFirst(6);
        doubleLinkedList.printForward();
        System.out.println(doubleLinkedList.deleteLast().data);
        doubleLinkedList.printForward();

    }
}
