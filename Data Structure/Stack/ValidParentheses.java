package Stack;
import java.util.Stack;
public class ValidParentheses {
    public static boolean ValidBrackets(String str){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(' || c == '[' || c == '{' ){
                stack.push(c);
            }
            else if(!stack.isEmpty() && c == ')' && stack.peek() == '('){
                stack.pop();
            }
            else if(!stack.isEmpty() && c == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if(!stack.isEmpty() && c == ']' && stack.peek() == '['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String combination = "][";
        boolean check = ValidBrackets(combination);
        if(check == true){
            System.out.println("Parentheses are valid !!!");
        }else System.out.println("Parentheses are not valid !!!");
    }
}
