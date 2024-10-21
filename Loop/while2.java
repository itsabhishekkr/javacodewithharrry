import java.util.*;
// Q) sum of number
public class while2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=1;
        while(count<=n){
            sum+=count;
            count++;
        }
        System.out.println("sum of number="+sum);
    }
}
