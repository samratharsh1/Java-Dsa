

public class shortestpath {
    public static void main(String[] args) {
        String t="wneenesennn";
        int n=0;
        int e=0;
        int s=0;
        int w=0;
        for(int i=0;i<t.length();i++){
            char d=t.charAt(i);
            if(d=='n'){n++;}
            if(d=='e'){e++;}
            if(d=='s'){s++;}
            if(d=='w'){w++;}
        }
        System.out.println(n+" " + e+" "+w+" "+s);
        System.err.println();
        double res=Math.sqrt((Math.abs(n-s)*Math.abs(n-s)+Math.abs(e-w)*Math.abs(e-w)));
        System.out.println(res);
    }
    
}
