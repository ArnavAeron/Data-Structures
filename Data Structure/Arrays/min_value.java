package Arrays;

public class min_value {

    public int minimum_value(int [] arr){
        int Min = arr[0];
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        return Min;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,2,0,1,0,6,0,5,4,3};
        min_value mv = new min_value();
        int a = mv.minimum_value(arr);
        System.out.println(a);
    }
}
