package Queue;

public class RepresentationOfQueue {
    private ListNode front;
    private ListNode rear;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int value){
            this.data = value;
            this.next = null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public static void main(String[] args) {
        
    }
}

