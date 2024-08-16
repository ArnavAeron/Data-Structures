package Arrays;

public class move_zeros_to_end {
    public void moveZeros(int []arr){
        int i=0;
        int j=arr.length-1;
        while(i<arr.length-1 && i<j){
            if(arr[i]==0 && arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i]==0 && arr[j]==0){
                j--;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        move_zeros_to_end mv = new move_zeros_to_end();
        Declaration_of_ d = new Declaration_of_();
        int [] arr = {1,0,0,3,4,5,0,6};
        mv.moveZeros(arr);
        d.display(arr);
    }
}
