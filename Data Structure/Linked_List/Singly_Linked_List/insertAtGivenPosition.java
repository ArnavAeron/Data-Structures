package Linked_List.Singly_Linked_List;

public class insertAtGivenPosition {
    private ListNode head;
    private static class ListNode{
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
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }System.out.print("null");
        System.out.println();
    }
    public static ListNode insert(ListNode l, int key, int index){
        ListNode temp = l;
        int ind = 1;
        ListNode newNode = new ListNode(key);
        if(index == 1){
            return newNode;
        }
        else{
            ListNode previous = null;
            while(temp!=null){
                previous = temp;
                temp = temp.next;
                ind++;
                if(ind == index){
                    previous.next = newNode;
                    newNode.next = temp;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        insertAtGivenPosition iagp = new insertAtGivenPosition();
        iagp.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);

        iagp.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original Linked List : ");
        display(iagp.head);

        System.out.println("After inserting the key at given position in Linked List : ");
        ListNode a = insert(iagp.head,9,6);
        display(a);
    }
}
