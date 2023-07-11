public class c6
{
    public static void main(String[] args) {

        int n=5;
        int trow=(2*n)-1;
        int row=0;
        int nst=1;
        int nsp=n-1;
        while(row<trow){
            //space
            for(int i=0;i<nsp;i++){
                System.out.print(" ");
            }

            //star

            for(int i=0;i<nst;i++){
                System.out.print(" *");
            }

            //
            if(row < trow/2) {
                nst++;
                nsp--;
            }
            else {
                nst--;
                nsp++;
            }
            System.out.println();
            row++;
        }
    }
}
