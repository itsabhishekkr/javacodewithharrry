public class l18countsetbitor1inbits {
    public static int count1inbit(int n){
        int count=0;
        while(n>0){
            int bitmask=1;
            if((n&bitmask)!= 0){
                count++;
            }
            n=n>>1;
        } 
        return(count);
    }
    public static void main(String args[]){
        System.out.println(count1inbit(15));

    }
    
}
