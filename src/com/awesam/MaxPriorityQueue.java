package com.awesam;

import java.util.Arrays;

public class MaxPriorityQueue {
    private Integer[]heap;
    private int n;
    public MaxPriorityQueue(int capacity){
        heap=new Integer[capacity];
        n=0;
    }
    public int size(){
        return n;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public void insert(int value){
        if (n== heap.length-1)resize(heap.length*2);
        n++;
        heap [n]=value;
        swim(n);
    }
    private void swim(int k){
        while (k>1&&heap[k/2]<heap[k]){
            int temp =heap[k];
            heap[k] =heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }
    /*public int deleteMax(){
    int max = heap[1];
    n--;
    swap(1,n);
    sink(1);
    heap[n+1]=null;
    if (n<(heap.length-1)/4)resize(heap.length/2);
    return max;
    }
    public void swap(int a,int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }

    public void sink(int k){
        while (n>2*k){
            int j = 2*k;
            if (n>j&&heap[j]<heap[j+1])j++;
            if(heap[k]>heap[j])break;
            swap(k,j);
            k=j;
        }
    }
    private   void resize(int capacity){
        Integer[] newArry=new Integer[capacity];
        for (int i = 0; i <heap.length ; i++) {
            newArry[i]=heap[i];
        }
        heap=newArry;
    }*/
   public int deletMax(){
        int max =heap[1];
        n--;
        swap(1,n);
        sink(1);
        heap[n+1]=null;
        if (n<(heap.length-1)/4)resize(heap.length/2);
        return max;
    }
    public void swap(int a, int b){
       int temp = heap[a];
        heap[a] =  heap[b];
        heap[b] = temp;
    }
    public void sink (int k){
        while (n>2*k){
            int j= 2*k;
            if (n>j&&heap[j]<heap[j+1])j++;
            if (heap[k]> heap[j])break;
            swap(k,j);
            k=j;
        }
    }
    private void resize(int capacity){
        Integer[]newArry=new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            newArry[i]=heap[i];
        }
        heap=newArry;
    }  public void display(){
        System.out.print("[");
        for (int i = 1; i <n ; i++) {
            System.out.print(heap[i]+", ");
        }
        System.out.println("]");
        System.out.println();
    }
    public static void main(String[] args) {
    MaxPriorityQueue maxPriorityQueue=new MaxPriorityQueue(5);
    maxPriorityQueue.insert(1);
        maxPriorityQueue.insert(2);
        maxPriorityQueue.insert(3);
        maxPriorityQueue.insert(4);
        maxPriorityQueue.insert(5);
        maxPriorityQueue.display();
        System.out.println(Arrays.toString(maxPriorityQueue.heap));

    }
}
