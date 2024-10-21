import java.util.*;
public class l12assigpalindrom {
    public static void palind(int n){
        int rem=0,num=0;
        int rev=n;
        while(n>0){
            rem=n%10;
            num=num*10+rem;
            n/=10;  
        }
        if(rev==num){
            System.out.println("palendrom number");
        }else{
            System.out.println("not palindom");
        }
    }    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        palind(N);
    }   
}
