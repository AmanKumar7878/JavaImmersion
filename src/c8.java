public class c8
{
    public static void main(String[] args)
    {
//        int n=5;
//        int nst=1;
//        int row=0;
//        int nsp=n-1;
//        int c=1;
//        while(row<n){
//            for (int i = 0; i < nsp; i++) {
//                System.out.print(" "+"\t");
//            }
//            for (int i = 0; i < nst; i++) {
//                System.out.print(c+"\t");
//                c++;
//            }
//            row++;
//            nst+=2;
//            nsp--;
//            c=1;
//
//            System.out.println();
//        }

        // Second pattern
//        int n=5;
//        int nst=1;
//        int row=0;
//        int nsp=n-1;
//        int c=1;
//        while(row<n){
//            for (int i = 0; i < nsp; i++) {
//                System.out.print(" "+"\t");
//            }
//            for (int i = 0; i < nst; i++) {
//                System.out.print(c+"\t");
//                if(i<(nst/2)){
//                    c++;
//                }
//                else c--;
//            }
//            row++;
//            nst+=2;
//            nsp--;
//            c=1;
//
//            System.out.println();
//        }

        // third pattern
//        int n=5;
//        int nst=1;
//        int row=0;
//        int nsp=n-1;
//        int c=1;
//        while(row<n){
//            for (int i = 0; i < nsp; i++) {
//                System.out.print(" "+"\t");
//            }
//            for (int i = 0; i < nst; i++) {
//                System.out.print(c+"\t");
//                if(i<(nst/2)){
//                    c++;
//                }
//                else c--;
//            }
//            row++;
//            nst+=2;
//            nsp--;
//            c+=2;
//
//            System.out.println();
//       }
//
//        int c=-1;
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                if(j>=3-c&&j<=3+c){
//                    System.out.print("  ");
//
//                }
//                else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//            if(i>=3)c--;
//            else{c++;}
//
//        }
//        int n=7;
//        int nst1=(n/2)+1;
//        int nst2=n/2;
//        int nsp=-1;
//
//        int row=0;
//        while(row<n){
//            //stars
//            for (int i = 0; i < nst1; i++) {
//                System.out.print("* ");
//            }
//            //space
//            for (int i = 0; i < nsp; i++) {
//                System.out.print("  ");
//            }
//            //stars
//            if(row==n-1){
//                nst2--;
//            }
//            for (int i = 0; i < nst2; i++) {
//                System.out.print("* ");
//            }
//            if(row<n/2){
//                nst1--;
//                if(row!=0){
//                    nst2--;
//                }
//                nsp+=2;
//            }
//            else{
//                nst1++;
//                nst2++;
//                nsp-=2;
//            }
//            row++;
//
//            System.out.println();
//       }

        int c=0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(j>=3-c&&j<=3+c){
                    System.out.print("  ");

                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            if(i>=3)c--;
            else{c++;}
        }


    }
}

