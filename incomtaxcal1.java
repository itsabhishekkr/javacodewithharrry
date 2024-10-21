import java.util.*;
public class incomtaxcal1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int incom=sc.nextInt();
        int a=500,b=1000,cal=0;
        if(incom<a){
            cal=0;
            System.out.println(cal);
        }
        else{
            if(incom>a&&incom<b){
            cal=(int)(incom*0.2);
            System.out.println(cal);
            }

        }
        if(incom>=b){
        cal=(int)(incom*0.3);
        System.out.println(cal);
         }
    }
}
