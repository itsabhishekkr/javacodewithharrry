import java.util.*;
public class l14assignment {
    // //Q1)
    // public static boolean  dublicat(int array[]){
    //     for(int i=0;i<array.length;i++){
    //         for(int j=i+1;j<array.length;j++){
    //             if(array[i]==array[j]){
    //                 return(true);
    //             }
    //         }
    //     }
    //     return(false);
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int num=sc.nextInt();
    //     int array[]=new int[num];
    //     for(int i=0;i<num;i++){
    //         array[i]=sc.nextInt();
    //     }
    //    boolean a= dublicat(array);
    //    System.out.println(a);
    // }
    //Q4)
    public static void raintrapped(int height[]){
        int maxleft[]=new int[height.length];
        int maxright[]=new int[height.length];
        maxleft[0]=height[0];
        for(int i=1;i<height.length;i++){
            maxleft[i]=Math.max(height[i],maxleft[i-1]);
        }
        maxright[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            maxright[i]=Math.max(height[i],maxright[i+1]);
        }
        //water level
        int waterlevel=Integer.MAX_VALUE;
        int watertrapped=0;
        for(int i=0;i<height.length;i++){
            waterlevel=Math.min(maxleft[i],maxright[i]);
            watertrapped+=height[i]-waterlevel;
        }
        System.out.println("water traped is equal to"+watertrapped);
    }
    public static void main(String args[]){
        int  height[]={0,1,0,2,1,0};
        raintrapped(height);
    }
}
