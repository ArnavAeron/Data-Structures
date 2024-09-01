package Linked_List.Doubly_Linked_List;

public class InsertNodeAtLast {
    public static class ListNode{
        int data;
        public ListNode next;
        public ListNode previous;
        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public static void display(ListNode l){
        ListNode temp = l;
        System.out.print("null");
        while (temp != null) {
            System.out.print(" <--- ");
            System.out.print(temp.data+" ---> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public static ListNode insertLast(ListNode l, int val){
        ListNode temp = l;
        ListNode newNode = new ListNode(val);
        while(temp.next != null){
            temp = temp.next;
        }
        if(temp.next == null){
            temp.next = newNode;
            newNode.previous = temp;
        }
        return l;
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.previous = fourth;
        fourth.previous = third;
        third.previous = second;
        second.previous = first;

        System.out.println("Original Doubly Linked List :");
        display(first);

        System.out.println("After inserting a node at the end of Doubly Linked List : ");
        display(insertLast(first, 10));
    }
}
