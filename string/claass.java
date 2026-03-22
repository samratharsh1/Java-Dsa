public class claass {
    public static void main(String[] args) {
        
        String s = "quickfoxjumps";
        String ans = "";
        String last = "";
        for (int i = 1; i < s.length()+1; i++) { 
            if ((i) % 4 == 0 || (i) % 6 == 0) {
                last += s.charAt(i-1);
            }
            else{ans += s.charAt(i-1);}
        }
        System.out.println(ans + last);
    }
    
}
