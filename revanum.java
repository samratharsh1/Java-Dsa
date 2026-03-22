public class revanum {
    public static int reverse(int x) {
        int n;
        int temp=0;
        String num=String.valueOf(Math.abs(x));
        int m=num.length();
        for(int i=0;i<m;i++){
            n=x%10;
            x=x/10;
            temp+=n*Math.pow(10,m-i-1);
        }
        return temp;        
    }
    public static void main(String[] args) {
        System.out.println(reverse(-234));
    }
    
}
