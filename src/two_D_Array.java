public class two_D_Array
{
    public static void main(String[] args) {
        int [][] arr= {
                {10,11,12,13},
                {20,21,22,23},
                {30,31,32,33},
                {40,41,42,43}
        };
        for (int i = 0; i < 4; i++) {
            if(i%2==0){
                for (int j = 0; j < 4; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }
            else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }

    }
}
