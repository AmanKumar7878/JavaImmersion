public class c5 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = n-1;
        int nst = n;
        int r = 0;
        int trow = (2*n)-1;
        while (r < trow) {
            for (int i = 0; i < nsp; i++) {
                System.out.print("   ");
            }
            for (int i = 0; i <nst; i++) {
                System.out.print("* ");
            }
            if(r<trow/2){
                r++;
                nsp--;
                nst--;
            }
            else{
                r++;
                nsp++;
                nst++;
            }

            System.out.println();

        }
    }
}
