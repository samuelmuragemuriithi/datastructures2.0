package com.awesam;

import java.util.Arrays;
import java.util.Queue;

public class myQueue {
    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{
        private ListNode next;
        private String data1;
        private int data;

        public ListNode(String data1){
            this.data1=data1;
            this.next=null;
        }
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public myQueue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int value){
        ListNode temp = new ListNode(value);
        if (isEmpty())front=temp;
        else rear.next=temp;
        rear=temp;
        length++;
    }
    public void enqueue(String value){
        ListNode temp = new ListNode(value);
        if (isEmpty())front=temp;
        else rear.next=temp;
        rear=temp;
        length++;
    }
    public int deque(){
        if (isEmpty())throw new IllegalArgumentException();
        int result= front.data;
        front=front.next;
        if (front==null)rear=null;
        length--;
        return result;
    }
    public String deque2(){
        if (isEmpty())throw new IllegalArgumentException();
        String  result= front.data1;
        front=front.next;
        if (front==null)rear=null;
        length--;
        return result;
    }
    public void display(){
        ListNode current = front;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");

    }
    static String[] toBinary(int n) {
        String [] binary= new String[n];
    myQueue queue=new myQueue();
    queue.enqueue("1");
        for (int i = 0; i < binary.length; i++) {
         binary[i]=  queue.deque2();
         String n1= binary[i]+"0";
         String n2= binary[i]+"1";
         queue.enqueue(n1);
         queue.enqueue(n2);
        }
        return binary;
    }
    public static void main(String[] args) {
        myQueue queue=new myQueue();
        queue.enqueue(1);
         queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();
        System.out.println();
        System.out.println(Arrays.toString(toBinary(10)));

    }
}
