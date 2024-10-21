import java.util.*;
public class l12binarytodecimal {
    public static void bintodec(int num){
        int dec=0,ld=0,i=0;
        while(num>0){
            ld=num%10;
            dec=dec + ld*(int)(Math.pow(2,i));
            i++;
            num/=10;
        }
        System.out.println("decimal no=" +dec);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        bintodec(num);
    }
}
