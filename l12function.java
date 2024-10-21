import java.util.*;
public class l12function {
    public static void hello(){
        System.out.println("hello world");
        System.out.println("my name is Abhishek Kumar");
    }
    public static void  sum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is ="+sum);
    

    }
     public static void main(String args[]){
        hello();
        sum();
    }
    
}
