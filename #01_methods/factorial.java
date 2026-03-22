public class factorial {
    public static void factorial(int a){
        if (a==0){
            System.out.println("1");
        }
        else{
            int k=1;
            for(int i=1;i<=a;i++){
                k=k*i;
            }
            System.out.println(k);
            }
    }

    public static void main(String[]args){
        int a=0;
        // factorial(a); only for factorial
    }
    
}

