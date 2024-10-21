class l20recursiondecring{
    public static void decring(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n);
        decring(n-1);
    }
    public static void main(String args[]){
        int n=10;
        decring(n);
        
    }
}