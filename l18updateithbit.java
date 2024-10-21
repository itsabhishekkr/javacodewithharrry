public class l18updateithbit {
    public static int setIthbit(int n,int i){
        int markbit=1<<i;
        return(n|markbit);
    }
    public static int clearithbit(int n,int i){
        int markbit=~(1<<i);
        return(n&markbit);
    }
    public static int updateithbit(int n,int i,int newbit){
        // if(newbit==0){
        //     return(clearithbit(n, i));
        // }else{
        //     return(setIthbit(n,i));
        // }
        ////or
        n=clearithbit(n,i);
        int markbit=newbit<<i;
        return(n|markbit);
        
        
    }
    public static void main(String args[]){
        System.out.println(updateithbit(14,2,1));
    }
    
}
