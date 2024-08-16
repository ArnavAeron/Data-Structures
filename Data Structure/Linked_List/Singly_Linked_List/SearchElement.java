package Linked_List.Singly_Linked_List;

public class SearchElement {
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
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("null"); System.out.println();
    }
    public int search(ListNode l , int key){
        ListNode temp = l;
        int count = 0;
        while(temp.data != key){
            temp = temp.next;
            count++;
        }
        if(temp.data == key) return (count);
        return -1;
    }
    public static void main(String[] args) {
        SearchElement se = new SearchElement();
        se.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode four = new ListNode(6);

        se.head.next = second;
        second.next = third;
        third.next = four;

        try {
            int key = 6;
            int a = se.search(se.head, key);
            if(a!=-1) System.out.println("Element "+key+" is present at position : "+(a+1));
        } catch (Exception e) {
            System.out.println("Element doesn't esist in the given list !");
        }
    }
}
