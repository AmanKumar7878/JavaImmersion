public class numberpattern
{
    public static void main(String[] args)
    {
        int n=10;
        int nst=1;
        int row=0;
        int nsp=n-1;
        int c=1;
        while(row<n){
            for (int i = 0; i < nsp; i++) {
                System.out.print(" "+"\t");
            }
            for (int i = 0; i < nst; i++) {
                System.out.print(c+"\t");
                c++;
            }
            row++;
            nst+=2;
            nsp--;

            System.out.println();
        }
    }
}
