package Linked_List.Singly_Linked_List;

public class find_length {
    private static listNode head;
    public static class listNode{
        public int data;
        public listNode next;
        public listNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int len(listNode l){
        int length = 0;
        listNode temp = l;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public static void main(String[] args) {
        find_length fl = new find_length();
        fl.head = new listNode(0);
        listNode second = new listNode(2);
        listNode third = new listNode(4);
        listNode fourth = new listNode(6);
        listNode fifth = new listNode(8);

        fl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        System.out.println(len(fl.head));
    }
}
