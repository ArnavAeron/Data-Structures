package Arrays;

public class resize {
    public int[] resizeArray(int arr[], int capacity){
        int temp[] = new int[capacity];
        if(capacity >= arr.length){
            for(int i=0; i<arr.length; i++){
                temp[i] = arr[i];
            }
        }
        else{
            for(int i=0; i<temp.length; i++){
                temp[i] = arr[i];
            }
        }
        
        return temp;
    }
    public static void main(String[] args) {
        resize r = new resize();
        Declaration_of_ d = new Declaration_of_();        
        int arr[] = {1,2,3,4,5,6};
        int [] a = r.resizeArray(arr, 10);
        d.display(a);
        
    }
}
