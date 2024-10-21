public class l18evenoddbit {
    public static void evenodd(int a){
        int bitmark=1;
        if((a&bitmark)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
        evenodd(2);
        evenodd(6);
        evenodd(9);
    }
    
}
