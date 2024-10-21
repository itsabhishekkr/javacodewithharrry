public class l20friendpairing {
    public static int  friendPairing(int n){
        if(n==1||n==2){
            return n;
        }
        //choise
        //Single
        int fnm1=friendPairing(n-1);
        //pairing 
        int fnm2=friendPairing(n-2);
        int pairWays=(n-1)*fnm2;
        //totalways
        int totalWays=fnm1+pairWays;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(friendPairing(3));
    }
    
}
