import java.util.*;
public class l12functionoverloading {
    public static int sum(int a,int b){
        return(a+b);
    }
    public static int sum(int c,int d,int e){
        return(c+d+e);
    }
    public static float sum(float a,float b){
        return(a+b);
    }
    public static void main(String args[]){
        System.out.println(sum(5,8));
        System.out.println(sum(4,6,8));
        System.out.println(sum(2.6f,4.4f));
    }
    
}
