public class subarray
{
    public static void main(String[] args)
    {
        int[] arr = {-1,-2,-10,-4,-5};
        int max=Integer.MIN_VALUE;
        // Sub Array
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j <arr.length; j++) {
//                int sum=0;
//                for (int k = i; k <=j ; k++) {
//                    //System.out.print(arr[k]+" ");
//                    sum+=arr[k];
//                }
//                //Maximum Sub Array
//
//                max=Math.max(max,sum);
//                //System.out.print(" = "+sum);
//                //System.out.println();
//            }
//
//        }
//        System.out.println(max);

        // Optimized

//        for (int i = 0; i < arr.length; i++) {
//            int sum=0;
//            for (int j = i; j <arr.length; j++) {
//                sum = sum + arr[j];
//
//                System.out.println(sum);
//                max = Math.max(max, sum);
//
//            }
//
//        }
//        System.out.println(max);

        // More optimized

        int sum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if(sum<0) sum=0;
            sum+=arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);




        }
}