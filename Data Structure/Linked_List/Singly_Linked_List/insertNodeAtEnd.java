package Linked_List.Singly_Linked_List;

public class insertNodeAtEnd {
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
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }System.out.print("null"); System.out.println();
    }
    public ListNode insertAtLast(ListNode l, int val){
        ListNode newNode = new ListNode(val);
        ListNode temp = l;
        if(l==null) return newNode;
        while(temp.next != null){
            temp = temp.next;
        }temp.next = newNode;
        temp=temp.next;
        return l;
    }
    public static void main(String[] args) {
        insertNodeAtEnd ine = new insertNodeAtEnd();
        // ine.head = new ListNode(0);
        // ListNode second = new ListNode(2);
        // ListNode third = new ListNode(4);

        // ine.head.next = second;
        // second.next = third;

        System.out.println("Original List is : ");
        ine.display(ine.head);

        System.out.println("List after adding an element at the end : ");
        ine.display(ine.insertAtLast(ine.head, 8));

    }
}
