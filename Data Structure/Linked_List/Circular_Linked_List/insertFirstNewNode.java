package Linked_List.Circular_Linked_List;

public class insertFirstNewNode {
    private static class ListNode{
        int data;
        public ListNode next;
        public ListNode(int value){
            this.data = value;
        }
    }
    public static void display(ListNode l){
        ListNode temp = l;
        System.out.print(temp.data+" ---> ");
        temp = temp.next;
        while(temp != l){
            System.out.print(temp.data+" ---> ");
            temp = temp.next;
        }System.out.print(temp.data); System.out.println();
    }
    public static ListNode insertFirst(ListNode l, int newValue){
        ListNode newNode = new ListNode(newValue);
        ListNode temp = l;
        while(temp.next != l){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = l;
        return newNode;
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = first;

        System.out.print("Original Linked List is : ");
        display(first);

        System.out.print("Linked List After Adding a node at the beginening : ");
        first = insertFirst(first, 0);
        display(first);

        System.out.print("Linked List After Adding a node at the beginening : ");
        ListNode negFirst = insertFirst(first, -1);
        display(negFirst);

    }
}
