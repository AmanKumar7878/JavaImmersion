public class squareroot
{
    public static void main(String[] args) {
        int low=0;
        int high=25;

        while(low<=high){
            int mid = (low+high)/2;
            int val = mid*mid;
            if(val==high){
                System.out.println(val);
                break;
            }
            else if(val>high){
                high=mid-1;
            }
            else low=mid+1;



        }
    }
}
