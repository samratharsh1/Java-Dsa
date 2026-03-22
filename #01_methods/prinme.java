public class prinme {
    public static boolean isprinme(int a){
        boolean isprinme=true;
        if (a==2){
            return true ;

        }

        for(int i=2;i<=Math.sqrt(a);i++){
            if ((a%i)==0){
                isprinme=false;
                break;
            }
        }
        return isprinme;
    }

    public static void uptoprime(int a){
        for (int i=2;i<a;i++){
            if (isprinme(i)==true){
                System.out.print(i+" ");
            }
        }
    }




    public static void main(String[] args) {
        uptoprime(100);
    }
    
}
