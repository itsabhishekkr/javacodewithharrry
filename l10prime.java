import java.util.*;
public class l10prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                b=10;
            }

        }
        if(b==10){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}   
