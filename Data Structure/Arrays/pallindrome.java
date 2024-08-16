package Arrays;

public class pallindrome {
    public boolean pallid(String a){
        char [] array = a.toCharArray();
        int j = array.length-1;
        for(int i=0; i<array.length; i++){
            if(array[i] == array[j]){
                j--;
            }
            else if(array[i] != array[j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "121";
        pallindrome p = new pallindrome();
        if(p.pallid(a)==true){
            System.out.println("It is a palindrome .");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
