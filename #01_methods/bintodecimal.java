public class bintodecimal {
    public static int bintodec(int a){
        int b=0;
        int p=0;
        while (a>0){
            int u=a%10;
            b=b+u*(int)Math.pow(2,p);
            p=p+1;
            a=a/10;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(bintodec(1000));
    }
    
}
