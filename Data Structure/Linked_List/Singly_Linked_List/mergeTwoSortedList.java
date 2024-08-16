package Linked_List.Singly_Linked_List;

public class mergeTwoSortedList {
    private ListNode head;
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
    public static ListNode mergeList(ListNode l, ListNode r){
        ListNode dummy = new ListNode(0);
        ListNode tl = l;
        ListNode tr = r;
        ListNode temp = dummy;
        while(tl != null && tr!=null){
            if(tl.data < tr.data){
                temp.next = tl;
                tl = tl.next;
            }else{
                temp.next = tr;
                tr = tr.next;
            }
            temp = temp.next;
        }
        while(tl != null){
            temp.next = tl;
            tl = tl.next;
            temp = temp.next;
        }
        while(tr != null){
            temp.next = tr;
            tr = tr.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        mergeTwoSortedList mtsl = new mergeTwoSortedList();
        mtsl.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        mtsl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        mergeTwoSortedList ml = new mergeTwoSortedList();
        ml.head = new ListNode(1);
        ListNode sec = new ListNode(3);
        ListNode thir = new ListNode(5);
        ListNode four = new ListNode(7);
        ListNode fif = new ListNode(9);

        ml.head.next = sec;
        sec.next = thir;
        thir.next = four;
        four.next = fif;

        System.out.print("Original Linked List - 1 :  ");
        display(mtsl.head);
        System.out.print("Original Linked List - 2 :  ");
        display(ml.head);

        System.out.println("New Merged Linked List is : ");
        display(mergeList(mtsl.head, ml.head));
    }
}
