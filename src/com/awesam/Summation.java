package com.awesam;

public class Summation {
    static  int sum(int n){
        double result = Math.pow((double) n,2);
        return (int) ((result+n)/2);
    }
    static  int sum2(int n){
        double result = Math.pow((double) n,2);
        return ((int) ((result+n)/2))-n+1;
    }
    static int isBanker(int n){
        int sum=1;
        int i = 0;
        while (n>i){
            sum+=i;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum2(10));
        System.out.println();
        System.out.println((isBanker(1))-sum(1));
        System.out.println((isBanker(2))-sum(2));
        System.out.println((isBanker(3))-sum(3));
        System.out.println((isBanker(4))-sum(4));
        System.out.println((isBanker(5))-sum(5));
        System.out.println((isBanker(6))-sum(6));
        System.out.println((isBanker(7))-sum(7));
        System.out.println((isBanker(8))-sum(8));
        System.out.println((isBanker(9))-sum(9));
        System.out.println((isBanker(10))-sum(10));
    }
}
