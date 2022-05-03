package com.awesam;

import java.util.Arrays;

public class Array {
    public static int min(int []arry){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arry.length ; i++) {
            if (i<min)min=i;
        }
        return min;
    }
    public static void reverseArray(int []arry){
        int start = 0;
        int end = arry.length-1;
        while (end>start){
            int temp = arry[start];
            arry[start]=arry[end];
            arry[end]=temp;
            start++;
            end--;
        }
    }
    public static boolean isParindrome(String word){
        char [] arry=word.toCharArray();
        int start = 0;
        int end = arry.length-1;
        while (start<end){
            if (arry[start]!=arry[end])return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }
    static boolean search(int []array,int key){
        for (int i = 0; i <array.length ; i++) {
            if (key==array[i])return true;
        }
        return false;
    }

    static int[] resize(int [] array,int capacity){
        int []newArray = new int[capacity];
        for (int i = 0; i < array.length ; i++) {
            newArray[i]=array[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int [] arry ={4,2,6,7,89,2,3,7,0,5};
        System.out.println(Arrays.toString(resize(arry,15)) );
        System.out.println(search(arry,7));
        System.out.println(min(arry));
        reverseArray(arry);
        System.out.println(Arrays.toString(arry));
        String word="madam";
        System.out.println(isParindrome(word));
    }
}
