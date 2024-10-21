public class l20incresing {
    public static void inc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        inc(n-1);
        System.out.print(n);
    }
    public static void main(String args[]){
        inc(10);
    }
    
}
