package Linked_List.Singly_Linked_List;

public class Representation {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Representation r = new Representation();
        r.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6); 

        r.head.next = second;
        second.next = third;
        third.next = fourth;
    }
}
