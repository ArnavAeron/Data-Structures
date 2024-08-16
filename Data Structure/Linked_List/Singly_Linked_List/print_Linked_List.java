package Linked_List.Singly_Linked_List;

public class print_Linked_List {
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void printListNode(ListNode head2){
        ListNode temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
    public static void main(String[] args) {
        print_Linked_List pll = new print_Linked_List();
        pll.head = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(8);

        pll.head.next = second;
        second.next = third;
        third.next = fourth;

        printListNode(pll.head);

        // Representation r = new Representation();
        // ListNode first = new ListNode(0);
        // ListNode sec = new ListNode(2);
        // ListNode thir = new ListNode(4);
        // ListNode four = new ListNode(6); 

        // first.next = sec;
        // sec.next = thir;
        // thir.next = four;
        // pll.printListNode(first);
    }
}
