package Oprater;
import java.util.*;
public class incometaxcal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int incom=sc.nextInt();
        int cal=0;
        if(incom<500000){
            cal=0;
        }
        else if(incom>=500000&&incom<1000000){
            cal=(int)(incom*0.2);
        }
        else{
            cal=(int)(incom*0.3);
        }
        System.out.println("your tax:'="+cal);
    }
}
