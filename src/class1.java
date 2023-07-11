public class class1
{
    public static void main(String[] args)
    {
        int n=5;
        int nsp=n;
        int nst=0;
        int r=0;
        while(r<n){
            for (int i = 0; i <nsp; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i <=nst; i++) {
                 System.out.print("* ");
           }

            r++;
            nsp--;
            nst++;
            System.out.println();

        }
        nsp=0;
        nst=n-1;
        r=0;
        while(r<n){
            for (int i = 0; i <=nsp; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i <nst; i++) {
                System.out.print(" *");
            }

            r++;
            nsp++;
            nst--;
            System.out.println();

        }
    }
}
