public class l20factorial {
    public static int fact(int n){
        if(n==1){
            return(n);
        }
        
    int f=n*fact(n-1);
    return(f);
    }
    public static void main(String args[]){
        System.out.print(fact(10));
    }
}
