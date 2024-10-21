public class l13butterfly {
    public static void bfly(int n){
        for(int i=1;i<=n;i++){
            if(i>=1&&i<=n/2){
                 for(int j=1;j<=n;j++){
                    if(j<=i||(j>n-i)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j<=(n-i+1)||j>=i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
        
    }
    public static void main(String args[]){
        bfly(10);
    }
    
}
