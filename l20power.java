public class l20power {
    public static int power(int x,int y){
        if(y==1){
            return(x);
        }
        int p=x*power(x,y-1);
        return(p);
    }
    public static void main(String args[]){
        System.out.print(power(5,3 ));
    }
    
}
