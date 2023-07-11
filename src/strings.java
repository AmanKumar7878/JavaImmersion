public class strings
{
    public static void main(String[] args) {
//        String s1= "Hello"; // it will store in String pool.
//        String s2= new String("Hello");  // it will store in haep;
//        String s3 = "Hello";
//        String s4= new String("Hello");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);  // it will return false because it compares address of both.
//        System.out.println(s1==s3);  // it return true because it will pointing same address;
//        System.out.println(s2==s4);  // it return false because it create new object every time at different location.

//        String s1="Hello";
//        String s2="Abc";
//        String s3=s1+s2;  //  here new keyword executes and creatre an object because strings are immutable.
//        String s4="HelloAbc";
//        System.out.println(s3==s4); // output False
//        String s1="Hello";
//        String s2="Abc";
//        String s3="Hello"+"Abc";  // it will add and become string litral and stored in string pool.
//        String s4="HelloAbc";// s3 and s4 both point same addresss so output will be true.
//        System.out.println(s3==s4); // output true

//
//        String s1="Hello";
//        String s2= new String("Hello");
//        System.out.println(s1.equals(s2));  // it compares only content not address.
//        String str  = "qwertyuiop";
//        str.substring(0,3);   // siongle parameter means starting index  othwerwise start and end . we will give string length as end parameter because it stops before lasr index;

        String str = "nitin";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String str1 = str.substring(i, j);
                if (isPalindrome(str1)) {
                    System.out.println(str1);
                }

            }
        }
    }

    private static boolean isPalindrome(String str1) {
        int high=str1.length()-1;
        int low=0;
        boolean flag=true;
        while(low<high){
            if(str1.charAt(low)!=str1.charAt(high)){
                flag=false;
                break;
            }
            else{
            low++;
            high--;}

        }
        return flag;
    }
}
