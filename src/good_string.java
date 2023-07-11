public class good_string
{
    public static void main(String[] args)
    {
        String str = "cbaeicde";
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String str1 = str.substring(i, j);
                int temp=str1.length();
                if (isGood(str1)) {
                    max=Math.max(max,temp);
                    
                }

            }
        }
        System.out.println(max);
    }
    private static boolean isGood(String str1) {

        for (int j = 0; j < str1.length(); j++){
            if(str1.charAt(j)=='a'|| str1.charAt(j)=='e'||str1.charAt(j)=='i'||str1.charAt(j)=='o'||str1.charAt(j)=='u'){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
