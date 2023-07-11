public class c7 {
    public static void main(String[] args) {
        int n=5;
        int row=0;
        int nst1=n;
        int nst2=n-1;
        int nsp=-1;
        while(row<n){
            // star
            for (int i = 0; i <nst1 ; i++) {
                System.out.print("*");

            }
            // space
            for (int i = 0; i <nsp ; i++) {
                System.out.print(" ");

            }
            // star
            for (int i = 0; i <nst2 ; i++) {
                System.out.print("*");

            }
            if(row==0) nst2++;
            nst1--;
            nst2--;
            nsp+=2;
            row++;
            System.out.println();
        }
    }
}
