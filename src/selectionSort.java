public class selectionSort
{
    public static void main(String[] args) {
        int[] arr = {1,5,9,4,3};

        for(int i=0;i<arr.length;i++){
            int key=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[key]>arr[j]){
                    key=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[key];
            arr[key]=temp;
        }
        for (int t: arr)
        {
            System.out.print(t +" ");
        }
    }
}
