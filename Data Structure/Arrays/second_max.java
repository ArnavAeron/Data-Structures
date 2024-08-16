package Arrays;

public class second_max {
    public void sec_max(int []arr) throws Exception{
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr.length<2){
                throw new Exception("Array need atleast 2 elements");
            }
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]>secMax && arr[i] != max){
                secMax = arr[i];
            }
            if(secMax == Integer.MIN_VALUE) {
                throw new Exception("No second maximum element found .");
            }
        }
        
        System.out.println("Second maximum element is : "+secMax);
    }
    public static void main(String[] args) {
        second_max sm = new second_max();
        int [] arr = {9};
        try{
            sm.sec_max(arr);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
