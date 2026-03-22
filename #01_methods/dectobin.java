public class dectobin {
    public static int dectobin(int a){
        int p=0;
        int n=0;
        int nu=0;
        while (a>0){
            n=a%2;
            nu+=n*(int)Math.pow(10,p);
            p=p+1;
            a=a/2;
            }

        return nu;
    }
    public static void main(String[] args) {
        System.out.println(dectobin(15));
    }
    
}
 