package com.awesam;

public class SinglyLinkedList  {
    /*public int length(){
        ListNode current = head;
        int count =0;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public ListNode middleItem(){
   if(head==null)return null;
   ListNode fastPtr= head;
   ListNode slowPtr= head;
   while(fastPtr!=null&&fastPtr.next!=null){
   slowPtr=slowPtr.next;
   fastPtr=fastPtr.next.next;

   }
   return slowPtr;
    }
    public ListNode deleteFirst(){
    if (head==null)return null;
    ListNode temp=head;
    head=head.next;
    temp.next=null;
    return temp;
    }
    public ListNode deleteEnd(){
    if(head==null)head=head.next;
    ListNode current = head;
    ListNode previous = null;
    while (current.next!=null){
    previous=current;
    current =current.next;
    }
    previous.next = null;
    return current;
    }
        public void duplicate(){
    if (head==null)return;
    ListNode current =head;
    while (current!=null&&current.next!=null){
        if (current.data==current.next.data)current.next=current.next.next;
        else current=current.next;
    }
    }
    public ListNode searchEnd(int position){
    if(head==null)return null;
    ListNode refPtr =head;
    ListNode mainPtr =head;
    int count =0;
    while (count<position){
    if(refPtr==null)throw new IllegalArgumentException("is greater than the size of the linked list");
    refPtr =refPtr.next;
    count++;
    }
    while (refPtr!=null){
    refPtr= refPtr.next;
    mainPtr=mainPtr.next;
    }
    return mainPtr;

    }
}*/
}
