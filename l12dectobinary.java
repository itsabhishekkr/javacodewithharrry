import java.util.*;
public class l12dectobinary {
    public static void bectobin(int n){
        int bi=0,rem,i=0;
        while(n>0){
            rem=n%2;
            bi=bi+(rem*(int)Math.pow(10,i));
            n/=2;
            i++;
        }
        System.out.println(bi);
    }
    public static void main(String args[]){
        bectobin(11);
    }
    
}
