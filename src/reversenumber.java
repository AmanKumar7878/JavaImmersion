public class reversenumber {

    public static void main(String[] args) {
        int  n  =  123456;
        int temp=0;
        while(n!=0){
            int r = n%10;
            temp =  (temp*10)+r;
            n/=10;

        }
        System.out.println(temp);
    }
}
