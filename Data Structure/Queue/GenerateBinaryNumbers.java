package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class GenerateBinaryNumbers {
    private static Que front;
    private static Que rear;
    private static int length;
    private static class Que{
        private int data;
        private Que next;
        public Que(int value){
            this.data = value;
            this.next = null;
        }
    }
    private static int length(){
        return length;
    }
    private static boolean isEmpty(){
        return length == 0;
    }

    public static void display(String[] binaryNumbers){
        for (String binaryNumer : binaryNumbers) {
            System.out.print(binaryNumer+" ");
        }
    }
    private static String [] generateBinaryNumbers(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for (int i = 0; i < n; i++) {
            result[i] = q.poll();
            String n1 = result[i]+"0";
            String n2 = result[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] q = generateBinaryNumbers(1000);
        display(q);

    }
}
