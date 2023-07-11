public class transpose_Matrix
{
    public static void main(String[] args) {
        int arr [] [] = {{10,11,12,13},{20,21,22,23},{30,31,32,33},{40,41,42,43}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
