public class l20lastaccurance {
    public static int firstocc(int arr[],int key,int i){
        if(i<0){
            return(-1);
        }
        if(arr[i]==key){
            return(i);
        }
        return(firstocc(arr,key,i-1));
    }
    public static void main(String args[]){
        int arr[]={1,3,4,6,8,5,6,5,8,9};
        int l=arr.length-1;
        System.out.println(firstocc(arr,5,l));
    }
}
