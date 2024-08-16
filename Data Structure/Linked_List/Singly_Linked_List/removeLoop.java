package Linked_List.Singly_Linked_List;

public class removeLoop {
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null; 
        }
    }
    public static void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public static void RemoveLoop(ListNode l){
        ListNode slow = l;
        ListNode fast = l;
        boolean hasloop = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                hasloop = true;
                break;
            }
        }
        // If a loop was detected, remove it
        if(hasloop) {
            getLoopOrigin(slow);
        }
    }
    public static void getLoopOrigin(ListNode slow){
        ListNode temp = head;
        while(temp.next != slow.next){
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
    }
    public static void main(String[] args) {
        removeLoop rl = new removeLoop();
        rl.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        rl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        RemoveLoop(rl.head);
        display();
    }
}
