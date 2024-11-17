package Stack;

import java.util.Stack;
public class ReverseAString {
    public static String ReverseString(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        for(int i=0; i<str.length(); i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String sentence = "My name is Arnav Aeron";
        String newSentence = ReverseString(sentence);
        System.out.println("--------------------------------------------");
        System.out.println("Original Sentence is : "+sentence);
        System.out.println("--------------------------------------------");
        System.out.println("New Reversed Sentence is : "+newSentence);
        System.out.println("--------------------------------------------");
    }
    
}
