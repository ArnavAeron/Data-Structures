package Linked_List.Singly_Linked_List;


public class Add_Two_Numbers {
    private ListNode head;
    private static class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {   
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int sum1 = 0;
        int sumOne = 0;
        int sum2 = 0;
        int sumTwo = 0;
        if(temp1.val == 0 && temp2.val == 0) return temp1;
        while(temp1 != null){
            sum1 = sum1*10+temp1.val;
            temp1 = temp1.next;
        }
        while(sum1>0){
            sumOne = (sumOne*10)+sum1%10;
            sum1 = sum1/10;
        }
        while(temp2 != null){
            sum2 = sum2*10+temp2.val;
            temp2 = temp2.next;
        }
        while(sum2>0){
            sumTwo = (sumTwo*10)+sum2%10;
            sum2 = sum2/10;
        }
        int a = sumOne+sumTwo;
        int rem = 0;
        ListNode head = null;
        ListNode tail = null;
        while(a>0){
            rem = a%10;
            a = a/10;
            ListNode newNode = new ListNode(rem);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Add_Two_Numbers atn = new Add_Two_Numbers();
        atn.head = new ListNode(1);
        ListNode second = new ListNode(9);
        ListNode third = new ListNode(9);
        ListNode four = new ListNode(9);
        ListNode five = new ListNode(9);
        ListNode six = new ListNode(9);
        ListNode seven = new ListNode(9);
        ListNode eight = new ListNode(9);
        ListNode nine = new ListNode(9);

        atn.head.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;

        printList(atn.head);

        Add_Two_Numbers atn2 = new Add_Two_Numbers();
        atn2.head = new ListNode(9);

        printList(atn2.head);
        ListNode head = atn2.addTwoNumbers(atn2.head,atn.head);
        printList(head);


    }
}
