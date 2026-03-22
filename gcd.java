public class gcd {
    public static void main(String[] args) {
        int n,m;
        n=16;
        m=12;
        int gcd=0;
        for(int i=1;i<=Math.min(m,n);i++){
            if ((n%i==0)&&(m%i==0)){
                gcd=i;
            }

        }

        System.out.println(gcd);



    }
    
}
