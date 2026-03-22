public class gridways {
    public static void main(String[] args) {
        int x=gridways(0, 0, 100,100 );
        System.out.println(x);

    }
    public static int gridways(int i,int j,int m,int n){
        if(i==m-1&&i==n-1){
            return 1;
        }
        else if(i==m||j==n){
            return 0;
        }
        int x=gridways(i+1, j, m, n);
        int y=gridways(i, j+1, m, n);
        return x+y;
    }
    
}
