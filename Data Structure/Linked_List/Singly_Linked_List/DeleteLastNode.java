package Linked_List.Singly_Linked_List;

public class DeleteLastNode {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(ListNode l){
        ListNode temp = l;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public ListNode deleteLast(ListNode l){
        ListNode temp = l;
        ListNode previous = null;
        while(temp.next != null){
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
        return l;
    }
    public static void main(String[] args) {
        DeleteLastNode dln = new DeleteLastNode();
        dln.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);
        ListNode sixth = new ListNode(10);

        dln.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.println("Original Linked List : ");
        dln.display(dln.head);

        System.out.println("Deleting Last Node from the Linked List : ");
        dln.display(dln.deleteLast(dln.head));
    }
}
