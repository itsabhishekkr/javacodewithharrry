import java.util.*;
public class l12primefunction {
    public static void isprime(int n){
        boolean prime=false;
        if(n==2){
            System.out.println("prime");
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                prime=true;
                break;
                }
            }
            if(prime==true){
            System.out.println("not prime.");
            }else{
            System.out.println(" prime");
            }
        } 
    }   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isprime(num);

    }    
    
    
}
