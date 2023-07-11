public class prime {
    public static void main(String[] args) {
        int n=18;
        for (int i = 2; i <=n ; i++) {
            int j=2;
            boolean flag = true;
            while(j<i){
                if(i%j==0){
                    flag=false;
                    break;
                }
                j++;
            }
            if(flag==true){
                System.out.println(i);

            }
        }
    }
}

