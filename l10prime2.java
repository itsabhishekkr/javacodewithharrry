import java.util.*;

public class l10prime2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n==2){
            System.out.println("prime");
        }else{
            for(int i=2;i<n;i++){
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
