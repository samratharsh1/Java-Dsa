public class decreasing {
    public static void main(String[] args) {
        dec(10);
        
    }
    static void dec(int n){
        if (n==1){
            System.out.println(n); return;
        }

        System.out.println(n+" ");
        dec(n-1);


    }
}
