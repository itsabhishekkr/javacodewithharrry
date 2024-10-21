import java.util.*;
public class l16palindrom{
    public static boolean palindrom(String str){
        int i=0;
        while(i>=0&&i<=str.length()/2){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                i++;
            }else{
                return(false);
            }
        }
        return(true);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean a=palindrom(str);
        if(a==true){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }

}