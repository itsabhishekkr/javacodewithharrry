public class l20fibonacci {
    public static int fibo(int n){
        if(n==1||n==0){
            return(n);
        }
        int f=fibo(n-1)+fibo(n-2);
        return(f);
    }
    public static void main(String args[]){
        System.out.print(fibo(5));
    }
}
