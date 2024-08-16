package Linked_List.Singly_Linked_List;

public class DeleteFirstNode {
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
    public ListNode DeleteFirst(ListNode l){
        ListNode temp = l;
        temp = temp.next;
        head = temp;
        return head;
    }
    public static void main(String[] args) {
        DeleteFirstNode dfn = new DeleteFirstNode();
        dfn.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        dfn.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original Linked List : ");
        dfn.display(dfn.head);

        System.out.println("List after deleting first node : ");
        dfn.display(dfn.DeleteFirst(dfn.head));
        dfn.display(dfn.DeleteFirst(dfn.head));
    }
}
