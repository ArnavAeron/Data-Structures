package Queue;

public class Dequeue {
    private static Queue front;
    private static Queue rear;
    private int length;
    private static class Queue{
        private int data;
        private Queue next;
        public Queue(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public static void dequeue(){
        Queue temp = front;
        front = temp.next;
        temp.next = null;
    }
    public static void enqueue(int data){
        Queue newNode = new Queue(data);
        if(front == null){
            rear = newNode;
            front = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public static void display(){
        Queue w = front;
        while(w != null){
            System.out.print(w.data+" ");
            w = w.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        enqueue(0);
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);

        System.out.print("Original Queue is : ");
        display();

        dequeue();
        dequeue();
        System.out.print("Queue after performing Dequeue operation on the Queue : ");
        display();
    }
}
