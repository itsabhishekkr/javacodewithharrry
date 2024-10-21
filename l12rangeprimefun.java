import java.util.*;
public class l12rangeprimefun {
    public static boolean rprime(int n){
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
            }
        }
        return(prime);
    
    }
    public static void checkprime(int num){
        for(int i=3;i<=num;i++){
            if(rprime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        checkprime(100);
    }
    
}
