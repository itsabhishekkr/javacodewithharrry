import java.util.*;

public class l10primeoptimise{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n==2){
            System.out.println("prime");
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){// 12=1*12/2*6/3*4/ after that every pair repeat so use squre root of n.
                if(n%i==0){
                    isprime=false;
                }
            }
            if(isprime==true){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }

    }
}   
