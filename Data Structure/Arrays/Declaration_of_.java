package Arrays;
import java.util.Scanner;
public class Declaration_of_{
    public static int[] initialize(int n){
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element number "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public void display(int [] arr){
        System.out.print("Your Array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Declaration_of_ d = new Declaration_of_();
        int [] arr = initialize(5);;
        
        d.display(arr);
    }
}