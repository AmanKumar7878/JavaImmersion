public class spiral_print {
    public static void main(String[] args) {
        int[][] arr ={
                {10,11,12,13},
                {20,21,22,23},
                {30,31,32,33},
                {40,41,42,43}};
        int cmin=0;
        int rmin=0;
        int cmax=arr[0].length -1;
        int rmax=arr.length -1;
        while (cmin<=cmax && rmin<=rmax){
            for (int i=cmin;i<=cmax;i++){
                System.out.print(arr[rmin][i]+" ");
            }
            rmin++;
            System.out.println();
        }
        cmax--;
        System.out.println();
        for(int i=cmax;i>=cmin;i--){
            System.out.print(arr[rmax][i]+" ");
        }
        rmax--;
        System.out.println();
        for (int i=rmax;i>=rmin;i--){
            System.out.println();
       }
    }
}
