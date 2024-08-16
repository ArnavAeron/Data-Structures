package Linked_List.Singly_Linked_List;

public class Reverse_list {
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
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public ListNode reverseList(ListNode l){
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
    public static void main(String[] args) {
        Reverse_list rl = new Reverse_list();
        rl.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        rl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original Linked List : ");
        rl.display(rl.head);

        System.out.println("Reverse Linked List : ");
        rl.display(rl.reverseList(rl.head));
    }
}
