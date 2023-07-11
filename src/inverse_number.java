import java.util.Scanner;

public class inverse_number
{
    public static void main(String[] args) {
//        int n=32145;
//        int rev = 0;
//        int place=1;
//        while(n!=0){
//            int r=n%10;
//            rev=rev + place*(int)Math.pow(10,r-1);
//            n/=10;
//            place++;
//        }
//        System.out.println(rev);

        // Array
        int arr[] = {1,2,3,4,5,6};
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int temp =arr[low];
            arr[low]=arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}
