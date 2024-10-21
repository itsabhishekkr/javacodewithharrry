import java.util.*;
public class l13inversepiramid {
    public static void invpir(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=(n-i+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        invpir(a);
    }
    
}
