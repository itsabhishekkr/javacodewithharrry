import java.util.*;
public class raindrop {
    public static void main(String args[]){
        int  height[]={1,0,2,1};
        calculate(height);
    }
    public static void calculate(int height[]){
        int sum=0;
        int max=-10000000;
        for(int i=0;i<height.length;i++){
            if(height[i]>=height[i+1]){
                sum+=height[i]-height[i+1];
            max=Math.max(height[i],height[i+1]);
            }
            else{
                sum+=Math.min(max,height[i+1])-height[i];
    
            }
        }
        System.out.println(sum);
    }
    
}
