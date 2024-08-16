package Linked_List.Singly_Linked_List;

public class insertNodeAtBegining {
    public ListNode head;
    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public ListNode insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public void display(ListNode l){
        ListNode temp = l;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }System.out.println("null");
    }
    public static void main(String[] args) {
        insertNodeAtBegining inb = new insertNodeAtBegining();
        inb.head = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(8);

        inb.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Original Linked List : ");
        inb.display(inb.head);
        System.out.println("Linked List after adding first element : ");
        inb.display(inb.insertFirst(0));
        

    }
}
