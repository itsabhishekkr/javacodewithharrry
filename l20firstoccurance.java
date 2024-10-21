public class l20firstoccurance {
    public static int firstocc(int arr[],int key,int i){
        if(i==arr.length){
            return(-1);
        }
        if(arr[i]==key){
            return(i);
        }
        return(firstocc(arr,key,i+1));
    }
    public static void main(String args[]){
        int arr[]={1,3,4,6,8};
        System.out.println(firstocc(arr,2,0));
    }
}
