package Linked_List.Singly_Linked_List;

public class DeleteAtGivenPosition {
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
        }System.out.print("null"); System.out.println();
    }
    public ListNode DeleteAt(ListNode l, int index){
        ListNode temp = l;
        int count = 1;
        ListNode previous = null;
        if(index==1) return temp.next;
        while(temp != null){
            previous = temp;
            temp = temp.next;
            count++;
            if(count == index){
                previous.next = temp.next;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        DeleteAtGivenPosition dagp = new DeleteAtGivenPosition();
        dagp.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        dagp.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original Linked List : ");
        dagp.display(dagp.head);

        System.out.println("After deleting the node from linked list at some given index : ");
        dagp.display(dagp.DeleteAt(dagp.head, 1));
    }
}
