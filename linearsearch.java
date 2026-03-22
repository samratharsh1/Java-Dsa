import java.util.Scanner;
public class linearsearch {
    public static int search(String num[], String ip){
        for(int i=0;i<num.length;i++){
            if (num[i].equals(ip)){//we use .equals because it compares the sting instead of refrence ==compares refrence obj
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int marks[]={8,7,3,9,10,6,8,5};
        String marks[]={"dosa","idli","sambhar","chutney"};
        Scanner sc=new Scanner(System.in);
        String ip=sc.next();
        
        System.out.println(search(marks, ip));
        sc.close();

        }
         Scanner sc=new Scanner(System.in);
        
    
}
