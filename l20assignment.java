public class l20assignment {
    //Q1)
    // public static void indexof2(int arr[],int startInd,StringBuilder sb){
    //     if(startInd==arr.length){
    //         System.out.println(sb.toString());
    //         return;
    //     }
    //     if(arr[startInd]==2){
    //         sb.append(startInd);
    //     }
    //     indexof2(arr,startInd+1,sb);
    // }
    // public static void main(String args[]){
    //     int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
    //     int startInd=0;
    //     StringBuilder sb=new StringBuilder("");
    //     indexof2(arr,startInd,sb);
    // }
    // //Q2)
    public static void inttoword(int n){
        String arr[]={"Zero","one","two","three","four","five","six","seven","eight","nine"};
        int r=0;
        if(n==0){
            return;
        }
        r=n%10;
        n=(int)(n/10);
        inttoword(n);
        System.out.print(arr[r]+" ");
    }
    public static void main(String args[]){
        inttoword(2019);
    }
    
                  
}
