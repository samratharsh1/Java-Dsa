public class xpowern {
    public static void main(String[] args) {
        System.out.println(xpow(3,2));
        System.out.println(xpower(5,2));
    }
    static int xpow(int n,int p){
        if(p==0){
            return 1; 
        }
        return n * xpow(n,p-1);
    }


    
    //--------------------optimised-------------------- ----



    static int xpower(int n, int p){
        if(p==0){
            return 1;
        }
        int half=xpower(n,p/2);
        int h=half*half;
        if(p%2!=0){
            h=n*h;
        }
        return h;
    }
    
}
 