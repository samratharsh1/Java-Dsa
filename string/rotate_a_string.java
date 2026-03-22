public class rotate_a_string {
    public static void main(String[] args) {
        String s="hello";
        String r=rigthrotate(s,3);
        String l=leftrotate(s,3);
        System.out.println( "original String >>"+s );
        System.out.println( "left rotated String >>"+l);
        System.out.println( "rigth rotated String >>"+r );
        
    }

     public static String rigthrotate(String s,int d ){
        int n=s.length();
        d=d%n;
        return s.substring(n-d)+s.substring(0,n-d);
    }
    public static String leftrotate(String s,int d ){
        int n=s.length();
        d=d%n;
        return s.substring(d)+s.substring(0,d);
    }
    
    
}
