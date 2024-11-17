package Queue;

public class Enqueue {
    private Queue front;
    private Queue rear;
    private int length=0;
    private static class Queue{
        private int data;
        private Queue next;
        public Queue(int value){
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
    public Queue EnQueue(int data){
        Queue newNode = new Queue(data);
        if(front == null){
            rear = newNode;
            front = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        length++;
        return front;
    }
    public void display(Queue q){
        Queue temp = front;
        while(temp != rear){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println(temp.data);
    }
    public static void main(String[] args) {
        Enqueue q = new Enqueue();
        q.EnQueue(2);
        q.EnQueue(4);
        q.EnQueue(6);
        q.EnQueue(8);
        System.out.println("Original Queue : ");
        q.display(q.front);
        System.out.println("Length of the queue is : "+q.length);

        System.out.println("----------------------------------------------------------------");
        
        q.EnQueue(10);
        System.out.println("Queue after inserted an element : ");
        q.display(q.front);
        System.out.println("Length of the Queue is : "+q.length);
    }
}
