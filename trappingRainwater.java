public class trappingRainwater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int lmax[]=new int[arr.length];
        int rmax[]=new int[arr.length];
        int wl=0;
        int trapped=0;
        lmax[0]=arr[0];
        rmax[arr.length-1]=arr[arr.length-1];
        
        for (int i = 1; i < arr.length; i++) {
            lmax[i]=Math.max(arr[i],lmax[i-1]);
            rmax[arr.length-1-i]=Math.max(arr[arr.length-1-i],rmax[rmax.length-i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==rmax[i]||arr[i]==lmax[i]){
                trapped+=0;
            }
            else{
                trapped+=Math.min(rmax[i],lmax[i])-arr[i];
            }
        }
        System.out.println(trapped);

        



    }
    
}
