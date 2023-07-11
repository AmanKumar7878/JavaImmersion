public class bubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,9,4,3};

        for(int pass=0;pass<arr.length-1;pass++){

            for (int i = 0; i < arr.length-1-pass; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }

            }
        }
        for (int t: arr)
        {
            System.out.print(t +" ");
        }

    }
}
