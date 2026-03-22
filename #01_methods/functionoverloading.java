public class functionoverloading {
    public static int multiply(int a,int b){
        return a*b;
    }
// same name of a function but it takes diffrent parameters ic called function over loading
    public static int multiply(int a,int b,int c){
        return a*b*c;
    }
    
    public static void main (String[]args){

        System.out.println(multiply(2,3));
        System.out.println(multiply(1,2,3));


    }
}
