public class l20sumofnaturalno {
    public static int sum(int n){
        if(n==1){
            return(1);
        }
        int add=n+sum(n-1);
        return(add);
    }
    public static void main(String args[]){
        System.out.print(sum(5));
    }
}
