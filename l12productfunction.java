import java.util.*;
public class l12productfunction {
    public static int product(int a,int b){
        int prod=a*b;
        return(prod);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int pro=product(x,y);
        System.out.println("product="+pro);
    }
}
