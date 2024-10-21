public class reverse2nd {
    public static void main(String args[]){
        int n=10899,rev=0,a;
        while(n>0){
            a=n%10;
            rev=(rev*10)+a;
            n=n/10;
        }
        System.out.println(rev);
    }
}
