package Linked_List.Circular_Linked_List;

public class insertLastNewNode {
    public static class ListNode{
        int data;
        public ListNode next;
        public ListNode(int value){
            this.data = value;
        }
    }
    public static void display(ListNode l){
        ListNode temp = l;
        System.out.print(temp.data + " ---> ");
        temp = temp.next;
        while(temp != l){
            System.out.print(temp.data+" ---> ");
            temp = temp.next;
        }System.out.print(temp.data); System.out.println();
    }
    public static ListNode insertLast(ListNode l, int val){
        ListNode temp = l;
        while(temp.next != l){
            temp = temp.next;
        }
        ListNode newNode = new ListNode(val);
        temp.next = newNode;
        newNode.next = l;
        return l;
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
        ListNode eighth = new ListNode(8);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = first;

        System.out.print("Original Linked List is : ");
        display(first);

        System.out.print("Insert a node at the end of Linked List : ");
        ListNode nine = insertLast(first, 9);
        display(nine);
    }
}
