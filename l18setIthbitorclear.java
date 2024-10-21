public class l18setIthbitorclear {
    public static int setIthbit(int n,int p){
        int bitmark=1<<2;
        return(n|bitmark);
    }
    public static int clearithbit(int n,int p){
        int bitmark=~(1<<p);
        return(n&bitmark);
    }
    public static void main(String args[]){
        System.out.println(setIthbit(10, 2));
        System.out.println(clearithbit(15,2));
    }
}
