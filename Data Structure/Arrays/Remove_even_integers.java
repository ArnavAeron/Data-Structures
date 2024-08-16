package Arrays;

public class Remove_even_integers {
     public int [] remove_even(int [] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        int [] temp = new int[count];
        int k=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                temp[k] = arr[i];
                k++;
            }
        }
        return temp;
     }

     public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Remove_even_integers re = new Remove_even_integers();
        int [] temp = re.remove_even(arr);
        Declaration_of_ d = new Declaration_of_();
        d.display(arr);
        d.display(temp);
     }
}
