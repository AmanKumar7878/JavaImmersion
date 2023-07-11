 import java.util.*;
public class soln
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        for (int i = 0; i <str.length() ; i+=3) {
            if(str.charAt(i)== str.charAt(i+1)){
                ans+=Character.toUpperCase(str.charAt(i));
            }
            else if(str.charAt(i)!= str.charAt(i+1)){
                if(str.charAt(i)>str.charAt(i+1)){
                    ans+=(char)(str.charAt(i)-'a'-1);
                }
                else{
                    ans+=(char)(str.charAt(i+1)+'a'-1);
                }
            }
        }
        System.out.println(ans);

    }
}
