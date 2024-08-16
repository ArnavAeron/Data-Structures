package Linked_List.Singly_Linked_List;

public class RemoveDuplicateFromSortedLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(ListNode l){
        ListNode temp = l;
        while(temp != null){
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public static ListNode removeDuplicates(ListNode l){
        ListNode temp = l;
        while(temp.data != temp.next.data){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return l;
    }
    public static void main(String[] args) {
        RemoveDuplicateFromSortedLinkedList rdfs = new RemoveDuplicateFromSortedLinkedList();
        rdfs.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(6);
        ListNode sixth = new ListNode(8);

        rdfs.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.println("Original Linked List : ");
        display(rdfs.head);

        System.out.println("Linked List after removing duplicate elements : ");
        display(removeDuplicates(rdfs.head));

    }
}
