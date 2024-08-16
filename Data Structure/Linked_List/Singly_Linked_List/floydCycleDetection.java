package Linked_List.Singly_Linked_List;

public class floydCycleDetection {
    public static class ListNode{
        public int data;
        public ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean floydLoopDetect(ListNode l){
        ListNode slow = l;
        ListNode fast = l;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static ListNode startOfLoop(ListNode l){
        ListNode slow = l;
        ListNode fast = l;
        ListNode req = null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                req = slow;
                break;
            }
        }
        ListNode temp = l;
        while(temp != req){
            temp = temp.next;
            req = req.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);
        ListNode sixth = new ListNode(10);
        ListNode seventh = new ListNode(12);
        ListNode eighth = new ListNode(14);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = fifth;

        System.out.println("Is there any loop in the given Linked List ? : ");
        boolean a = floydLoopDetect(head);
        if(a == true){
            System.out.println("yes, given Linled List contains a loop");
            System.out.println("node from which loop starts is : ");
            System.out.println(startOfLoop(head).data);
        }else{
            System.out.print("No, There is no loop in provided Linked List .");
        }
    }
}
