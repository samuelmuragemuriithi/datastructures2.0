package com.awesam;

import java.util.Arrays;

public class sortingAlgorthims {
    static void insertSort(int[]arr){
        for (int i = 1; i < arr.length ; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr= {9,4,3,2,3,4,5,6,6,7,8};
        int key = 10;

        System.out.println();
        int [] arr2= {9,4,3,2,3,4,5,6,6,7,8};
        System.out.print("After insertion sort: ");
        insertSort(arr2);
        System.out.print(Arrays.toString(arr2));

    }
}
