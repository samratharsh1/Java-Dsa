public class ncr {
    public static int factorial(int a) {
        int k=0;
        if (a==0){
             k=1;
             return k ;
        }
        else{
            int p=1;
            for (int i = 1; i <= a; i++) {
                p=p*i;
                k=p;
            }
            return k;
        }

    }
    public static int bincoeff(int n,int r){

        return (factorial(n)/(factorial(r)*factorial(n-r)));

        }

        
    

    public static void main(String[] args) {
        int n=10;
        int r=10;
        // and ncr = n!/(n-r)!
        System.out.println(bincoeff(n,r));
        
    }
    
}
