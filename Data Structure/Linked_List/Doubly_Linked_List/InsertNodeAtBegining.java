package Linked_List.Doubly_Linked_List;

public class InsertNodeAtBegining {
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
        while(temp != null){
            System.out.print(" <--- ");
            System.out.print(temp.data+" ---> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public static ListNode insertAtFirst(ListNode l, int val){
        ListNode newNode = new ListNode(val);
        newNode.next = l;
        l.previous = newNode;
        l = newNode;
        return l;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(8);

        head.next = second;
        second.next = third;
        third.next = fourth;

        second.previous = head;
        third.previous = second;
        fourth.previous = third;

        System.out.println("Original Doubly Linked List : ");
        display(head);

        System.out.println("After inserting a new node in the original Linked List : ");
        display(insertAtFirst(head, 0));
    }
}
