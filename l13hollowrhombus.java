public class l13hollowrhombus {
    public static void solroh(int n,int b){
        for(int i=1;i<=b;i++){
            for(int j=1;j<=n;j++){
                if(j==((int)(n/2)-i+2)||j==(n-i+1)||(i==1&&j>=((int)(n/2)-i+2))||(i==b&&j<=n/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        solroh(9,5);
    }

    
}
