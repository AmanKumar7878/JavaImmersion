public class Zagged_Array
{
    public static void main(String[] args)
    {
        int [][] arr = new int [4][];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        for (int i = 0; i <4 ; i++)
        {
            arr[i]= new int[i+3];
        }
        System.out.println(arr);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
        System.out.println(arr[3].length);
    }

}
