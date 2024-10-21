public class l13hollorectangle {
    public static void hollrec(int l,int b){
        for(int i =1;i<=b;i++){
            for(int j=1;j<=l;j++){
                if(i==1||i==b||j==1||j==l){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
    public static void main(String args[]){
        hollrec(5,4);

    }
}
