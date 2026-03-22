import java.util.*;
public class stockSpan {
    public static void main(String[] args) {
        int []stocks={100,80,60,70,60,85,100};
        int []span=new int [stocks.length];
        stockspan(stocks ,span);
        for(int i:span){
            System.out.print(i+" ");
        }
    }
    // stock span problem: har day ka "span" calculate karna hai
    // span[i] = kitne consecutive previous days (including current) tak stock price
    // current day ke price se chhota ya equal raha
    static void stockspan(int [] stock,int [] span){
        Stack<Integer> s=new Stack<>();

        // pehle day ka span hamesha 1 hota hai
        span[0]=1;
        s.push(0); // stack me index store kar rahe hain

        for(int i=1;i<stock.length;i++){
            int curr=stock[i];

            // stack me jin days ke prices curr se chhote hain, unko pop kar do
            // kyunki unka contribution aage nahi rahega (curr unko dominate kar raha hai)
            while(!s.isEmpty() && curr>stock[s.peek()]){
                s.pop();
            }

            // agar stack empty ho gaya to iska matlab curr se pehle koi bada price nahi tha
            if(s.isEmpty()){
                // furthest to left tak sab smaller ya equal the
                span[i]=i+1;
            }
            else{
                // stack top pe previous greater price ka index hai
                // span = current index - us index
                int prev=s.peek();
                span[i]=i-prev;
            }

            // current day ka index stack me push kar do
            s.push(i);
        }

    }
}
  