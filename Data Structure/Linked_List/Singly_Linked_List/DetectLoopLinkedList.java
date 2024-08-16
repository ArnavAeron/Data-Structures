package Linked_List.Singly_Linked_List;

public class DetectLoopLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int val){
            this.data = val;
            this.next = null;
        }
    }
    public void display(ListNode l){
        ListNode temp = l;
        while (temp != null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public static boolean DetectLoop(ListNode l){
        ListNode temp = l;
        ListNode temp2 = l;
        while(temp2 != null && temp2.next != null){
            temp = temp.next;
            temp2 = temp2.next.next;
            if(temp == temp2){
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        DetectLoopLinkedList dll = new DetectLoopLinkedList();
        dll.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);
        ListNode sixth = new ListNode(10);

        dll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = fourth;

        // System.out.println("Linked List we had is : ");
        // dll.display(dll.head);

        boolean a = DetectLoop(dll.head);

        System.out.println("Do we have loop in the provided Linked List : ");
        if(a == true){
            System.out.print("Yes There is a loop in provided linked list");
        }
        else{
            System.out.print("No, There is no loop in the provided Linked List ");
        }
    }
}
