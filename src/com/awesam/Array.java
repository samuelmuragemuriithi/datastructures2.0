package com.awesam;

public class Array {
    public static int min(int []arry){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arry.length ; i++) {
            if (i<min)min=i;
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arry ={4,2,6,7,89,2,3,7,0,5};
        System.out.println(min(arry));
    }
}
