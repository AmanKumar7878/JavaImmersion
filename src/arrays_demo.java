import java.util.Arrays;

public class arrays_demo {
    public static void main(String[] args) {
//        int arr[]= {1,0,3,4};
//        int product=1;
//        for (int i = 0; i < arr.length; i++) {
//
//            if(arr[i]!=0){
//                product*=arr[i];
//            }
//        }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != 0) {
//                    arr[i] = product / arr[i];
//                }
//            }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//
//
//        }




                //WITHOUT DIVISIOR OPERATOR
                int []array={1,2,3,4};
                int []left=new int[array.length];
                int []right=new int[array.length];
                int product=1;
                left[0]=product;
                for(int i=1;i< array.length;i++){
                    product=product*array[i-1];
                    left[i]=product;
                }
                System.out.println(Arrays.toString(left));
                product=1;
                right[array.length-1]=product;
                for(int i= array.length-2;i>=0;i--){
                    product=product*array[i+1];
                    right[i]=product;
                }
                System.out.println(Arrays.toString(right));
                int[] temp=new int[array.length];
                for(int i=0;i< array.length;i++){
                    temp[i]=left[i]*right[i];

                }
                System.out.println(Arrays.toString(temp));


    }
}
