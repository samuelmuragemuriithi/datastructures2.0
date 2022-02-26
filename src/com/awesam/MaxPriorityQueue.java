package com.awesam;

public class MaxPriorityQueue {
   /* public int deleteMax(){
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
   /* public int deletMax(){
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
    }*/
    public static void main(String[] args) {

    }
}
