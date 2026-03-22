public class fibonachi {
    public static void main(String[] args) {
        // System.out.println(fact(6));
        // System.out.println(sum(10));
        System.out.println(fibo(3));
    }

    static int fibo(int n){
        if(n<=0||n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }



    

    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fibo(n-1);
    }

    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }




}
