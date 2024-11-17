package Stack;

public class PushElement {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        private Node top;

        public Stack() {
            this.top = null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        
        st.push(4);
        System.out.println("Top element is: " + st.peek());

        st.push(5);
        System.out.println("Top element is: " + st.peek());
    }
}
