package Linked_List.Doubly_Linked_List;

public class DeleteLastNode {
    private static class ListNode{
        int data;
        ListNode next;
        ListNode previous;
        public ListNode(int value){
            this.data = value;
            this.next = null;
            this.previous = null;
        }
    }
    public void display(ListNode l){
        ListNode temp = l;
        System.out.print("null");
        while(temp != null){
            System.out.print(" <--- "+temp.data+" ---> ");
            temp = temp.next;
        }System.out.print("null");  System.out.println();
    }
    protected ListNode deleteLast(ListNode l){
        ListNode temp = l;
        while(temp.next != null){
            temp = temp.next;
        }temp.previous.next = null;
        temp.previous = null;
        return l;
    }
    public static void main(String args[]){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
        ListNode eighth = new ListNode(8);
        ListNode ninth = new ListNode(9);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = ninth;

        ninth.previous = eighth;
        eighth.previous = seventh;
        seventh.previous = sixth;
        sixth.previous = fifth;
        fifth.previous = fourth;
        fourth.previous = third;
        third.previous = second;
        second.previous = first;

        DeleteLastNode dln = new DeleteLastNode();
        System.out.print("Original Linked List is : ");
        dln.display(first);

        System.out.print("Linked List After removing Last element : ");
        dln.deleteLast(first);
        //dln.deleteLast(first);
        //dln.deleteLast(first);
        //dln.deleteLast(first);
        //dln.deleteLast(first);
        //dln.deleteLast(first);
        dln.display(first);
        
    }
}
