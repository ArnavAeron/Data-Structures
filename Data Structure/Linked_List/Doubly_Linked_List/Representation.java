package Linked_List.Doubly_Linked_List;

class Representation{
    
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
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

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        second.previous = head;
        third.previous = second;
        fourth.previous = third;
        fifth.previous = fourth;

        System.out.println("Original Doubly Linked List : ");
        display(head);

    }
}