import java.util.*;
public class findlargest {
    // public static int largest(int arr[]){
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if (arr[i]>largest){
    //             largest=arr[i];
    //         }

    //     }
    //     return largest;

    

    public static void main(String[] args) {
        int marks[]={1,0,1,0,2,0,1,0,2};
        int zero=0;int one=0;
        int two=0;
        for(int i:marks){
            if(i==0){
                zero++;
                System.out.println(i);
            }
            if(i==1){
                one++;
                System.out.println(i);
            }
            if(i==2){
                two++;
                System.out.println(i);
            }
        }
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        for(int i=0;i<marks.length;i++){
            if(i<zero){
                marks[i]=0;
            }
            else if(i>=zero&&i<(zero+one)){
                marks[i]=1;
            }
            else{marks[i]=2;}
        }
        for(int i:marks){
            System.out.print(i+ " ");
        }


    }
    
}
