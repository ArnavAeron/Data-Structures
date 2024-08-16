package Linked_List.Singly_Linked_List;

public class middle_node {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void middleNode(ListNode l){
        ListNode left = l;
        ListNode right = l.next;
        while(right != null && right.next != null){
            left = left.next;
            right = right.next.next;
        }
        System.out.println(left.data);
    }
    public static void main(String[] args) {
        middle_node mn = new middle_node();
        mn.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        mn.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.print("Middle node of the given Linked List is : ");
        mn.middleNode(mn.head);
    }
}
