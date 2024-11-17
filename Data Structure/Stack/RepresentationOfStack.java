package Stack;

public class RepresentationOfStack{
    public class Stack{
        public Stack next;
        public int data;
        public Stack(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Stack display(Stack s){
        Stack temp = s;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
        return s;
    }
    public static void main(String [] args){
        RepresentationOfStack rs = new RepresentationOfStack();
        Stack s1 = rs.new Stack(0);
        Stack s2 = rs.new Stack(1);
        Stack s3 = rs.new Stack(2);
        Stack s4 = rs.new Stack(3);
        Stack s5 = rs.new Stack(4);
        Stack s6 = rs.new Stack(5);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;

        System.out.print("Original Stack is : ");
        System.out.println(rs.display(s1));


    }
}