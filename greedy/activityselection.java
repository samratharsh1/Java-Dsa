

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activityselection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //given is sorted according to end

       

        // int maxAct=0;
        // ArrayList<Integer> ans=new ArrayList<>();

        // // 1st activity
        // maxAct=1;
        // ans.add(0);
        // int lastEnd=end[0];
        // for(int i=0;i<end.length;i++){
        //     if(start[i]>=lastEnd){
        //         // activity select
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd=end[i];  
        //     }
        // }
        // System.out.println(maxAct);
        // for (int i :ans) {
        //     System.out.print(i+  " ");
        // }



        // for 2d
         int act[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        } 
        // for sorting 2d array
        Arrays.sort(act,Comparator.comparing(a -> a[2]));


         int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        // 1st activity
        maxAct=1;
        ans.add(act[0][0]);
        int lastEnd=act[0][2];
        for(int i=1;i<end.length;i++){
            if(act[i][1]>=lastEnd){
                // activity select
                maxAct++;
                ans.add(act[i][0]);
                lastEnd=act[i][2];  
            }
        }
        System.out.println(maxAct);
        for (int i :ans) {
            System.out.print(i+  " ");
        }



    }
    
}
