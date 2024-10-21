import java.util.*;
public class l12function2 {
    public static void hello(){
        System.out.println("hello world");
        System.out.println("my name is Abhishek Kumar");
    }
    public static void  sum(int a,int b){
        int sum=a+b;
        System.out.println("sum is ="+sum);
    }
    public static int add(int a,int b){//a and b is perameter or formal parameter
        int sum=a+b;
        return(sum);
    }
     public static void main(String args[]){
        hello();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);//a and b is arrgument or actual parameter
        int add=add(a,b);//a and b is arrgument or actual parameter
        System.out.println(add);
    }
    
}
