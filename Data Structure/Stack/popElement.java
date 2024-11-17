package Stack;

public class popElement {
    private static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private static class stack{
        private static node top;
        private static int length=0;
        public stack(){
            this.top = null;
            this.length = 0;
        }
        public static void pop(){
            try{
                int result = top.data;
                top = top.next;
                length--;
                System.out.println("The popped element is : "+result);
            }catch (Exception e){
                System.out.println("Stack is already empty !!!");
            }
        }
        public static int push(int data){
            node newNode = new node(data);
            newNode.next = top;
            top = newNode;
            length++;
            return top.data;
        }
    }
    public static void main(String[] args) {
        System.out.println("The pushed element is : "+stack.push(2));
        System.out.println("The pushed element is : "+stack.push(4));

        stack.pop();
        stack.pop();
        stack.pop();

    }
}
