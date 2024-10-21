import java.util.*;
public class l10except10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);
        }
    }
    
}
