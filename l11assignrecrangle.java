import java.util.*;
public class l11assignrecrangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<b;i++){
            for(int j=0;j<l;j++){
                 System.out.print("*");
            }
            System.out.println();
            for(int i=1;i<b-1;i++){
                 for(int j=1;j<l-1;j++){
                    System.out.print(" ");
                }
            }
            System.out.println();

            
        }

    }
}
