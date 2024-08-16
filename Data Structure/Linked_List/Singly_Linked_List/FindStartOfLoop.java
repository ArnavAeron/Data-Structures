package Linked_List.Singly_Linked_List;

public class FindStartOfLoop {
    private static ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(ListNode l){
        ListNode temp = l;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public static ListNode FindStartofLoop(ListNode l){
        ListNode slow = l;
        ListNode fast = l;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return getStarted(slow);
            }
        }
        return null;
    }
    public static ListNode getStarted(ListNode slow){
        ListNode temp = head;
        while(temp != slow){
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        FindStartOfLoop fs = new FindStartOfLoop();
        fs.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        fs.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        System.out.println("starting of loop in the list : ");
        System.out.println(FindStartofLoop(fs.head).data);
    }
}
