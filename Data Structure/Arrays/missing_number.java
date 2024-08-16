package Arrays;

public class missing_number {
    public int missingValue(int arr[]){
        int n = arr.length+1;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        return(expectedSum-actualSum);
    }
        public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,9};
        missing_number mn = new missing_number();
        Declaration_of_ d = new Declaration_of_();
        d.display(arr);
        int a = mn.missingValue(arr);
        System.out.println(a);
    }
}
