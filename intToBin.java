import java.util.*;
public class intToBin {
    public static void main(String[] args) {
        System.out.println(decToBin(10));
        System.out.println(1<<20);



        
    }




    static int decToBin(int n){
        int bin=0;
        int i=0;
        while(n!=0){
            bin+=(n%2)*(int )Math.pow(10,i);
            n=n/2;
            i++;
        }
        return bin;
    }

    
    
}
