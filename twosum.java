import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class twosum {
    public static void main(String[] args) throws IOException {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        
        // Read array as space-separated integers
        String line = b.readLine();
        String[] parts = line.split(" ");
        int[] arr = new int[parts.length];
        for(int i = 0; i < parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        
        // Read target value k
        int k = Integer.parseInt(b.readLine());
        
        // Two sum logic
        Set<Integer> set = new HashSet<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int target=k-arr[i];
            if(set.contains(target)){
                ans++;
            }
            set.add(arr[i]);
        }
        System.out.println(ans);
    }
}
