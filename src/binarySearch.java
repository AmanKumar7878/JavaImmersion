public class binarySearch
{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};
        int low=0;
        int target=8;
        boolean flag=false;
        int high= arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]== target){
                flag=true;
                break;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else low=mid+1;



        }
        if(flag){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
