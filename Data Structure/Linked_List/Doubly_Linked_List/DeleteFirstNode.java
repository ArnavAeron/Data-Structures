package Linked_List.Doubly_Linked_List;

public class DeleteFirstNode {
    private static class ListNode{
        int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public ListNode deleteFirst(ListNode l){
        if(l == null ||l.next == null) return null;
        ListNode temp = l;
        temp.next.previous = null;
        l = l.next;
        temp.next = null;
        return l;
    }
    public void display(ListNode l){
        ListNode temp = l;
        System.out.print("null");
        while(temp != null){
            System.out.print(" <--- "+ temp.data+" ---> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public static void main(String args[]){
        DeleteFirstNode dfn = new DeleteFirstNode();
        ListNode head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);
        ListNode sixth = new ListNode(10);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        sixth.previous = fifth;
        fifth.previous = fourth;
        fourth.previous = third;
        third.previous = second;
        second.previous = head;

        System.out.print("Original Linked List is : ");
        dfn.display(head);

        System.out.print("Linked List after deleting it's first element : ");
        head = dfn.deleteFirst(head);
        //head = dfn.deleteFirst(head);
        //head = dfn.deleteFirst(head);
        //head = dfn.deleteFirst(head);
        //head = dfn.deleteFirst(head);
        //head = dfn.deleteFirst(head);
        dfn.display(head);
    }
}
