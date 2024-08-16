package Arrays;

public class Reverse {
    public int[] rev(int [] ar){
        int count = ar.length/2;
        int i=0;
        int j = ar.length-1;
        while(count>=0){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
            count--;
        }
        return ar;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        Reverse r = new Reverse();
        int [] temp = r.rev(arr);
        Declaration_of_ d = new Declaration_of_();
        d.display(temp);
    }
}