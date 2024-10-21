import java.util.*;
public class l12swapfunction {
    public static void swap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("finaly swap a and b");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[]){
    
        swap();

    }
    
}
