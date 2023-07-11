public class c2
{
    public static void main(String[] args) {
//        int n = 5;
//        int nsp = 0;
//        int nst = n;
//        int r = 0;
//        while (r < n) {
//            for (int i = 0; i <= nsp; i++) {
//                System.out.print(" *");
//            }
//            for (int i = 0; i <= nst; i++) {
//                System.out.print(" ");
//            }
//
//            r++;
//            nsp++;
//            nst--;
//            System.out.println();
        // Other pattern
        int n=5;
        int trow=(2*n)-1;
        int row=0;
        int nst=1;

        while(row<trow){
            //star
            for(int i=0;i<nst;i++){
                System.out.print(" *");
            }
            //
            if(row < trow/2) nst++;
            else nst--;
            System.out.println();
            row++;
        }
    }
}
