import java.util.*;
public class l12combinationfunction {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return(fact);
    }
    public static int combination(int n,int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nrfact=factorial(n-r);
        return(nfact/(rfact*nrfact));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int combi=combination(n,r);

        System.out.println(combi);
    }

}
