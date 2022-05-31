package com.awesam;

public class Stack {
private ListNode top;
private int length;
 private class ListNode{
     private int data;
     private ListNode next;

     public ListNode(int data) {
         this.data = data;
     }
 }

    public Stack() {
        this.top = null;
        this.length = 0;
    }
    public int length(){
     return length;
    }
    public boolean isEmpty(){
     return length==0;
    }
    public void push(int value){
     ListNode temp=new ListNode(value);
     temp.next=top;
     top=temp;
     length++;
    }
    public int pop(){
     if (isEmpty())throw new IllegalArgumentException();
     int result=top.data;
     top=top.next;
     length--;
     return result;
    }
    public int peek(){
        if (isEmpty())throw new IllegalArgumentException();
        return top.data;
    }
 static boolean isvalidParenthesis(String par){
     Stack stack=new Stack();
     for(char c: par.toCharArray()){
         if(c=='{'||c=='['||c=='(')stack.push(c);
         else{
             if(stack.isEmpty())return false;
             else {
                 char top = (char) stack.peek();
                 if(c=='}'&&top=='{'||c==']'&&top=='['||c==')'&&top=='(')stack.pop();
                 else return false;
             }
         }
     }
     return stack.isEmpty();
 }

    public static void main(String[] args) {
        Stack stack= new Stack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.print("my stack: ");
        for (int i = 0; i <4 ; i++) {
            stack.peek();
            System.out.print(stack.pop()+", ");
        }
    }
}
