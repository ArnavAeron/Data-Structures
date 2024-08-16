package Linked_List.Singly_Linked_List;

import Arrays.Reverse;

public class ReverseLinkedList {
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode reverse(ListNode l){
        ListNode current = l;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public void display(ListNode l){
        ListNode temp = l;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList rl = new ReverseLinkedList();
        rl.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);

        rl.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Original Linked List : ");
        rl.display(rl.head);

        System.out.println("Reversed Linked List : ");
        
        rl.display(rl.reverse(rl.head));

    }
}
