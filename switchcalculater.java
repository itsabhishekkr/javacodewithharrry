import java.util.*;
public class switchcalculater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char opr=sc.next().charAt(0);
        switch(opr){
            case '+':System.out.println(a+b);
                      break;
            case '-':System.out.println(a-b);
                       break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
                     break;
            default:System.out.println("oprater not found");
        }
    }
}
