package Linked_List.Singly_Linked_List;

public class findNthNodeFromTheEnd {
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
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }System.out.print("null");  ;System.out.println();
    }
    public int findNthNode(ListNode l, int n){
        ListNode mainPointer = l;
        ListNode refferencePointer = l;
        int count = 0;
        while(count < n){
            refferencePointer = refferencePointer.next;
            count++;
        }
        while(refferencePointer != null){
            mainPointer = mainPointer.next;
            refferencePointer = refferencePointer.next;
        }
        return mainPointer.data;
    }
    public static void main(String[] args) {
        findNthNodeFromTheEnd fn = new findNthNodeFromTheEnd();
        fn.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        fn.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original Linked List is : ");
        fn.display(fn.head);

        System.out.println("Getting Nth Node of Linked List from the end : ");
        System.out.print(fn.findNthNode(fn.head, 3));
    }
}
